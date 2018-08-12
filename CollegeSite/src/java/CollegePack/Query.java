/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegePack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Query {

    private static String QUESTIONID="QUESTION_ID",QUESTIONTITLE="QUESTION_TITLE",QUESTIONDESC="QUESTION_DESC",USERID="USER_ID",CLUBID="CLUB_ID",DATE="DATE";
    private static String TABLE="QUERY";
    
    private String strQuestionTitle,strQuestionDesc;
    private int iUserId,iQuestionId,iClubId;
    private Date date;

    /**
     * @return the strQuestion
     */
    public String getStrQuestionTitle() {
        return strQuestionTitle;
    }

    /**
     * @param strQuestion the strQuestion to set
     */
    public void setStrQuestionTitle(String strQuestion) {
        this.strQuestionTitle = strQuestion;
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
     * @return the iQuestionId
     */
    public int getiQuestionId() {
        return iQuestionId;
    }

    /**
     * @param iQuestionId the iQuestionId to set
     */
    public void setiQuestionId(int iQuestionId) {
        this.iQuestionId = iQuestionId;
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
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    /**
     * @return the strQuestionDesc
     */
    public String getStrQuestionDesc() {
        return strQuestionDesc;
    }

    /**
     * @param strQuestionDesc the strQuestionDesc to set
     */
    public void setStrQuestionDesc(String strQuestionDesc) {
        this.strQuestionDesc = strQuestionDesc;
    }
    
    public Query(){}
    
    public  void addQuery(Query query){
         
        Connection con=null;
        PreparedStatement st = null;
        
        try{
            
             con = (Connection) ConnectionFactory.getConnection();
             st = (PreparedStatement) con.prepareStatement("Insert into "+TABLE+" ( "+QUESTIONTITLE+","+QUESTIONDESC+","+USERID+","+CLUBID+","+DATE+ ") values ( ? , ? , ? , ? , ? )");
             
             st.setString(1,query.getStrQuestionTitle());
             st.setString(2,query.getStrQuestionDesc());
             st.setInt(3,query.getiUserId());
             st.setInt(4,query.getiClubId());
             st.setDate(5,(java.sql.Date) query.getDate());
             
             int res=st.executeUpdate();
             
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
    
    public static Query getQueryByQueryId(int queryid)
    {
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs=null;
        Query query=new Query();
        
        try
        {
              con = ConnectionFactory.getConnection();
              st=con.prepareStatement("Select * from "+TABLE+" where "+QUESTIONID+" = "+queryid);
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
              
              query.setiQuestionId(rs.getInt(QUESTIONID));
              query.setStrQuestionTitle(rs.getString(QUESTIONTITLE));
              query.setStrQuestionDesc(rs.getString(QUESTIONDESC));
              query.setiUserId(rs.getInt(USERID));
              query.setiClubId(rs.getInt(CLUBID));
              query.setDate(rs.getDate(DATE));
              
              
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
        
        return query;
    }
    
    
    public static ArrayList<Query> getAllQueriesByUserId(int userid)
    {
         Connection con =null ;
         PreparedStatement st=null;
         ResultSet rs=null;
         ArrayList<Query> list=new ArrayList<Query>();
         
         try
         {
             con = ConnectionFactory.getConnection();
              st=con.prepareStatement("Select * from "+TABLE+" where "+USERID+" = "+userid);
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
                    Query query=new Query();
                    query.setiQuestionId(rs.getInt(QUESTIONID));
                    query.setStrQuestionTitle(rs.getString(QUESTIONTITLE));
                    query.setStrQuestionDesc(QUESTIONDESC);
                    query.setiUserId(rs.getInt(USERID));
                    query.setiClubId(rs.getInt(CLUBID));
                    query.setDate(rs.getDate(DATE));
                    list.add(query);
                    
              }while(rs.next());
              
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
         
        return list;
    }
    
    public static ArrayList<Query> getAllQueriesByClubId(int clubid)//filtered by upvotes
    {
         Connection con =null ;
         PreparedStatement st=null;
         ResultSet rs=null;
         ArrayList<Query> list=new ArrayList<Query>();
         
         try
         {
             con = ConnectionFactory.getConnection();
              st=con.prepareStatement("Select * from "+TABLE+" where "+CLUBID+" = "+clubid);
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
                    Query query=new Query();
                    query.setiQuestionId(rs.getInt(QUESTIONID));
                    query.setStrQuestionTitle(rs.getString(QUESTIONTITLE));
                    query.setStrQuestionDesc(rs.getString(QUESTIONDESC));
                    query.setiUserId(rs.getInt(USERID));
                    query.setiClubId(rs.getInt(CLUBID));
                    query.setDate(rs.getDate(DATE));
                    list.add(query);
                    System.out.println("inside getqueryby clubid");
              }while(rs.next());
              
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
         
        return list;
    }

}
