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
public class Event {
    
     private static String EVENTID="EVENT_ID",EVENTNAME="EVENT_NAME",USERID="USER_ID",FESTID="FEST_ID";
     private static String STARTDATE="START_DATE",ENDDATE="END_DATE",INSTITUTENAME="INSTITUTENAME",UPVOTE="UPVOTE";
     private static String TABLE1="EVENT",TABLE2="REGISTER_EVENT";
     
     private String strEventName,strInstituteName;
     private int iEventId,iUserId,iFestId,iUpvote;
     private Date startdate,enddate;

    /**
     * @return the strEventName
     */
    public String getStrEventName() {
        return strEventName;
    }

    /**
     * @param strEventName the strEventName to set
     */
    public void setStrEventName(String strEventName) {
        this.strEventName = strEventName;
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
     * @return the iEventId
     */
    public int getiEventId() {
        return iEventId;
    }

    /**
     * @param iEventId the iEventId to set
     */
    public void setiEventId(int iEventId) {
        this.iEventId = iEventId;
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
     * @return the iFestId
     */
    public int getiFestId() {
        return iFestId;
    }

    /**
     * @param iFestId the iFestId to set
     */
    public void setiFestId(int iFestId) {
        this.iFestId = iFestId;
    }

    /**
     * @return the iUpvote
     */
    public int getiUpvote() {
        return iUpvote;
    }

    /**
     * @param iUpvote the iUpvote to set
     */
    public void setiUpvote(int iUpvote) {
        this.iUpvote = iUpvote;
    }

    /**
     * @return the startdate
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * @param startdate the startdate to set
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * @return the enddate
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * @param enddate the enddate to set
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
     
    public void addEvent(Event event)
    {
         Connection con=null;
         PreparedStatement st = null;
         
         try
         {
              con = (Connection) ConnectionFactory.getConnection();
              st = (PreparedStatement) con.prepareStatement("Insert into "+TABLE1+" ( "+EVENTNAME+","+USERID+","+FESTID+","+STARTDATE+","+ENDDATE+","+INSTITUTENAME+","+UPVOTE+ ") values ( ? , ? , ? , ? )");
              
              st.setString(1,event.getStrEventName());
              st.setInt(2,event.getiUserId());
              st.setInt(3,event.getiFestId());
              st.setDate(4,(java.sql.Date) event.getStartdate());
              st.setDate(5,(java.sql.Date) event.getEnddate());
              st.setString(6,event.getStrInstituteName());
              st.setInt(7,event.getiUpvote());
              
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
    
     public static ArrayList<Event> getAllEventsByFestId(int festid)
    {
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs=null;
        ArrayList<Event> list=new ArrayList<Event>();
        
        try
        {
            
              con = ConnectionFactory.getConnection();
              st=con.prepareStatement("Select * from "+TABLE1+" where "+FESTID+" = "+festid);
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
                  Event event=new Event();
                  event.setiEventId(rs.getInt(EVENTID));
                  event.setStrEventName(rs.getString(EVENTNAME));
                  event.setiUserId(rs.getInt(USERID));
                  event.setStartdate(rs.getDate(STARTDATE));
                  event.setEnddate(rs.getDate(ENDDATE));
                  event.setiFestId(rs.getInt(FESTID));
                  event.setStrInstituteName(rs.getString(INSTITUTENAME));
                  event.setiUpvote(rs.getInt(UPVOTE));
                  
                  list.add(event);
                  
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
    public static Event getEventByEventId(int eventid)
    {
        Event event = null ;
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs=null;
        try
        {
              con = ConnectionFactory.getConnection();
              st = con.prepareStatement("Select * from "+TABLE1+" where "+EVENTID+" = "+eventid );
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
              
                  event=new Event();
                  event.setiEventId(rs.getInt(EVENTID));
                  event.setStrEventName(rs.getString(EVENTNAME));
                  event.setiUserId(rs.getInt(USERID));
                  event.setStartdate(rs.getDate(STARTDATE));
                  event.setEnddate(rs.getDate(ENDDATE));
                  event.setiFestId(rs.getInt(FESTID));
                  event.setStrInstituteName(rs.getString(INSTITUTENAME));
                  event.setiUpvote(rs.getInt(UPVOTE));
              
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
        return event;
    }
     public static ArrayList<Event> getAllEventsByUserId(int userid)
    {
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs=null;
        ArrayList<Event> list=new ArrayList<Event>();
        
        try
        {
            
              con = ConnectionFactory.getConnection();
              st=con.prepareStatement("Select * from "+TABLE2+" where "+USERID+" = "+userid);
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
                  Event event=Event.getEventByEventId(rs.getInt(EVENTID));
                  list.add(event);
                  
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
    
     public void addRegisterEvent(int userid,int eventid)
    {
         Connection con=null;
         PreparedStatement st = null;
         
         try
         {
              con = (Connection) ConnectionFactory.getConnection();
              st = (PreparedStatement) con.prepareStatement("Insert into "+TABLE2+" ( "+USERID+","+FESTID+ ") values ( ? , ? )");
              
              st.setInt(1,eventid);
              st.setInt(2,userid);
              
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
    public static ArrayList<User> getAllUsersByEventId(int eventid)
    {
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs=null;
        ArrayList<User> list=new ArrayList<User>();
        
        try
        {
            
              con = ConnectionFactory.getConnection();
              st=con.prepareStatement("Select * from "+TABLE2+" where "+EVENTID+" = "+eventid);
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
}
