package CollegePack;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */


public class Club {
    private static String CLUBID="CLUB_ID",INSTITUTENAME="INSTITUTE_NAME",CLUBNAME="CLUB_NAME",ADMINID="ADMIN_ID";
    private static String TABLE1="CLUB";
    private static String USERID="USER_ID";
    private static String TABLE2="REGISTER_CLUB";
    
    private String strClubName,strInstituteName;
    private int iUserId,iClubId,iAdminId;
    
    public Club()
    {}

    /**
     * @return the strClubName
     */
    public String getStrClubName() {
        return strClubName;
    }

    /**
     * @param strClubName the strClubName to set
     */
    public void setStrClubName(String strClubName) {
        this.strClubName = strClubName;
    }

    /**
     * @return the strInstituteName
     */
    public String getStrInstituteName() {
        return strInstituteName;
    }

    /**
     * @param strInstituteName the strInstituteName to set
     */
    public void setStrInstituteName(String strInstituteName) {
        this.strInstituteName = strInstituteName;
    }

    /**
     * @return the iUserId
     */
    public int getiUserId() {
        return iUserId;
    }

    /**
     * @param iUserId the iUserId to set
     */
    public void setiUserId(int iUserId) {
        this.iUserId = iUserId;
    }

    /**
     * @return the iClubId
     */
    public int getiClubId() {
        return iClubId;
    }

    /**
     * @param iClubId the iClubId to set
     */
    public void setiClubId(int iClubId) {
        this.iClubId = iClubId;
    }

    /**
     * @return the iAdminId
     */
    public int getiAdminId() {
        return iAdminId;
    }

    /**
     * @param iAdminId the iAdminId to set
     */
    public void setiAdminId(int iAdminId) {
        this.iAdminId = iAdminId;
    }
    
    public void addClub(Club club)
    {
         Connection con=null;
         PreparedStatement st = null;
         try
         {
             con = (Connection) ConnectionFactory.getConnection();
             st = (PreparedStatement) con.prepareStatement("Insert into "+TABLE1+" ( "+CLUBNAME+","+INSTITUTENAME+","+ADMINID+ ") values ( ? , ? , ? )");
             st.setString(1,club.getStrClubName());
             st.setString(2,club.getStrInstituteName());
             st.setInt(3,club.getiAdminId());
             
             int res = st.executeUpdate();
             
         }
          catch(SQLException e)
       {
               // JOptionPane.showMessageDialog(null,e.toString());
               System.out.println("Error"+e.getMessage());
       }
      catch(Exception ob)
      {
            //JOptionPane.showMessageDialog(null,ob.toString());
            System.out.println("Error"+ob.getMessage());
      }
     finally
     {
       try
       {
           if(con!=null)
             con.close();
        
           if(st!=null)
             st.close();
         
       }catch(SQLException e) {}
     }
    }
    
   public static void register_for_club(int userid,int clubid)
   {
         Connection con=null;
         PreparedStatement st = null;
         try
         {
             con = (Connection) ConnectionFactory.getConnection();
             st = (PreparedStatement) con.prepareStatement("Insert into "+TABLE2 +"("+USERID+","+CLUBID +") VALUES ( ?, ? )");
             st.setInt(1,userid);
             st.setInt(2,clubid);
             
             int rs=st.executeUpdate();
         }
          catch(SQLException e)
          {
               // JOptionPane.showMessageDialog(null,e.toString());
               System.out.println("Error"+e.getMessage());
           }
        catch(Exception ob)
        {
                //JOptionPane.showMessageDialog(null,ob.toString());
                System.out.println("Error"+ob.getMessage());
        }
        finally
        {
        try
        {
               if(con!=null)
                 con.close();
        
            if(st!=null)
                 st.close();
         
            }catch(SQLException e) {}
        }
   }
   
    public static ArrayList<User> getAllMembersByClubId(int clubid)
    {
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs=null;
        ArrayList<User> list=new ArrayList<User>();
        
        try
        {
            
              con = ConnectionFactory.getConnection();
              st=con.prepareStatement("Select * from "+TABLE2+" where "+CLUBID+" = "+clubid);
              rs=st.executeQuery();
              if(!rs.next())
              {
                //throw new NoFAQFoundException("No FAQ Found");
                 try
                 {
                    if(con!=null)
                         con.close();
                     if(rs!=null)
                         rs.close();
                    if(st!=null)
                         st.close();
                 }catch(SQLException e) {}
                return null;
              }
              do
              {
                  User user=User.getUserByUserId(rs.getInt(USERID));
                  list.add(user);
                  
              }while(rs.next());
        }    
           catch(SQLException e)
            {
                 // JOptionPane.showMessageDialog(null,e.toString());
            }
            catch(Exception ob)
            {
                //JOptionPane.showMessageDialog(null,ob.toString());
            }
           finally
            {
                try
                {
                    if(con!=null)
                        con.close();
                    if(rs!=null)
                        rs.close();
                    if(st!=null)
                        st.close();
                }catch(SQLException e) {}
            }
         return list;     
        
    }
   
    public static ArrayList<Club> getClubByUserId(int userid)
    {
        Club club = null ;
        ArrayList<Club> clubList = new ArrayList<Club>();
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs1=null,rs=null;
        try
        {
              con = ConnectionFactory.getConnection();
              st = con.prepareStatement("Select * from "+TABLE2+" where "+USERID+" = "+userid );
              rs1 = st.executeQuery();
              if(!rs1.next())
              {
                //throw new NoFAQFoundException("No FAQ Found");
                 try
                 {
                    if(con!=null)
                         con.close();
                     if(rs1!=null)
                         rs1.close();
                    if(st!=null)
                         st.close();
                 }catch(SQLException e) {}
                return null;
              }
             do{
                  
              st = con.prepareStatement("Select * from "+TABLE1+" where "+CLUBID+" = "+rs1.getInt(CLUBID));
              rs = st.executeQuery();
              if(!rs.next())
               {
                //throw new NoFAQFoundException("No FAQ Found");
                 try
                 {
                    if(con!=null)
                         con.close();
                     if(rs!=null)
                         rs.close();
                    if(st!=null)
                         st.close();
                 }catch(SQLException e) {}
                return null;
                }
            
                do
                {
                    club=new Club();
                    club.setStrClubName(rs.getString(CLUBNAME));
                    club.setiClubId(rs.getInt(CLUBID));
                    club.setStrInstituteName(rs.getString(INSTITUTENAME));
                    club.setiAdminId(rs.getInt(ADMINID));
                    clubList.add(club);
                
                }while(rs.next());
             
              }while(rs1.next());
            
        }
         
     	catch(SQLException e)
       	{
         // JOptionPane.showMessageDialog(null,e.toString());
      	}
        catch(Exception ob)
        {
           //JOptionPane.showMessageDialog(null,ob.toString());
    	}
          finally
        {
            try
              {
                if(con!=null)
                    con.close();
                if(rs!=null)
                    rs.close();
                if(st!=null)
                    st.close();
              }catch(SQLException e) {}
        }
      
   
      return clubList;
    }
    
    public static Club getClubByClubId(int clubid)
    {
        Club club = null ;
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs=null;
        try
        {
              con = ConnectionFactory.getConnection();
              st = con.prepareStatement("Select * from "+TABLE1+" where "+CLUBID+" = "+clubid );
              rs = st.executeQuery();
              if(!rs.next())
              {
                //throw new NoFAQFoundException("No FAQ Found");
                 try
                 {
                    if(con!=null)
                         con.close();
                    if(rs!=null)
                         rs.close();
                    if(st!=null)
                         st.close();
                 }catch(SQLException e) {}
                return null;
              }
              
              club=new Club();
              club.setStrClubName(rs.getString(CLUBNAME));
              club.setiClubId(rs.getInt(CLUBID));
              club.setStrInstituteName(rs.getString(INSTITUTENAME));
              club.setiAdminId(rs.getInt(ADMINID));
              
              
        }
        catch(SQLException e)
       	{
         // JOptionPane.showMessageDialog(null,e.toString());
      	}
        catch(Exception ob)
        {
           //JOptionPane.showMessageDialog(null,ob.toString());
    	}
          finally
        {
            try
              {
                if(con!=null)
                    con.close();
                if(rs!=null)
                    rs.close();
                if(st!=null)
                    st.close();
              }catch(SQLException e) {}
        }
        return club;
    }
    public static boolean checkUserforClub(int userid,int clubid)
    {
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs=null;
        
        try
        {
             con = ConnectionFactory.getConnection();
             st=con.prepareStatement("Select * from "+TABLE2+" where "+USERID+" = "+userid+" and "+CLUBID+" = "+clubid);
             rs=st.executeQuery();
             if(!rs.next())
             {
                 try
                 {
                    if(con!=null)
                         con.close();
                     if(rs!=null)
                         rs.close();
                    if(st!=null)
                         st.close();
                 }catch(SQLException e) {}
                return false;
             }
             
        }
        catch(SQLException e)
            {
                 // JOptionPane.showMessageDialog(null,e.toString());
            }
            catch(Exception ob)
            {
                //JOptionPane.showMessageDialog(null,ob.toString());
            }
           finally
            {
                try
                {
                    if(con!=null)
                        con.close();
                    if(rs!=null)
                        rs.close();
                    if(st!=null)
                        st.close();
                }catch(SQLException e) {}
            }
         return true;
    }
    public static ArrayList<Integer> getAllNotInClubsByUserId(int userid)
    {
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs1=null;
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        try
        {
            
              con = ConnectionFactory.getConnection();
              //System.out.println("Select * from "+TABLE1+" where "+CLUBID+" not in (Select "+CLUBID+" from "+TABLE1+" natural join "+TABLE2+")");
              st=con.prepareStatement("Select * from "+TABLE1+" where "+CLUBID+" not in (Select "+CLUBID+" from "+TABLE1+" natural join "+TABLE2+" where "+USERID+" = "+userid+")");
              rs1=st.executeQuery();
              if(!rs1.next())
              {
                //throw new NoFAQFoundException("No FAQ Found");
                 try
                 {
                    if(con!=null)
                         con.close();
                     if(rs1!=null)
                         rs1.close();
                    if(st!=null)
                         st.close();
                 }catch(SQLException e) {}
                return null;
              }
             
              do
              {
                  list.add(rs1.getInt(CLUBID));
                  System.out.println("here");
                  
              }while(rs1.next());
              System.out.println(list.size());
        }    
           catch(SQLException e)
            {
                 // JOptionPane.showMessageDialog(null,e.toString());
            }
            catch(Exception ob)
            {
                //JOptionPane.showMessageDialog(null,ob.toString());
            }
           finally
            {
                try
                {
                    if(con!=null)
                        con.close();
                    if(rs1!=null)
                        rs1.close();
                    if(st!=null)
                        st.close();
                }catch(SQLException e) {}
            }
         return list;     
        
    }
    
}
