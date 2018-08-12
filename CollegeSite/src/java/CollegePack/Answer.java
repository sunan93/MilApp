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
public class Answer {
    
     private static String ANSWERID="ANSWER_ID",ANSWER="ANSWER",USERID="USER_ID",DATE="DATE",UPVOTE="UPVOTE",QUESTIONID="QUESTION_ID";
     private static String TABLE="RESOLUTION";
    
     private String strAnswer;
     private int iUserId,iQuestionId,iAnswerId,iupvote;
     private Date date;

    /**
     * @return the strAnswer
     */
    public String getStrAnswer() {
        return strAnswer;
    }

    /**
     * @param strAnswer the strAnswer to set
     */
    public void setStrAnswer(String strAnswer) {
        this.strAnswer = strAnswer;
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
     * @return the iAnswerId
     */
    public int getiAnswerId() {
        return iAnswerId;
    }

    /**
     * @param iAnswerId the iAnswerId to set
     */
    public void setiAnswerId(int iAnswerId) {
        this.iAnswerId = iAnswerId;
    }

    /**
     * @return the iupvote
     */
    public int getIupvote() {
        return iupvote;
    }

    /**
     * @param iupvote the iupvote to set
     */
    public void setIupvote(int iupvote) {
        this.iupvote = iupvote;
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
    
    public void addAnswer(Answer answer)
    {
        Connection con=null;
        PreparedStatement st = null;
        System.out.println("inside add ans"+answer.getiQuestionId());
        
        try{
            
             con = (Connection) ConnectionFactory.getConnection();
             st = (PreparedStatement) con.prepareStatement("Insert into "+TABLE+" ( "+ANSWER+","+USERID+","+DATE+","+UPVOTE+","+QUESTIONID+ ") values ( ? , ? , ? , ? , ? )");
             
             st.setString(1,answer.getStrAnswer());
             st.setInt(2,answer.getiUserId());
             st.setDate(3,(java.sql.Date) answer.getDate());
             st.setInt(4,answer.getIupvote());
             st.setInt(5, answer.getiQuestionId());
             
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
    public static ArrayList<Answer> getAllANswersByQueryId(int queryid)//filtered by upvotes
    {
     
         Connection con =null ;
         PreparedStatement st=null;
         ResultSet rs=null;
         ArrayList<Answer> list=new ArrayList<Answer>();
         
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
              do
              {
                    Answer answer=new Answer();
                    answer.setiQuestionId(rs.getInt(QUESTIONID));
                    answer.setiAnswerId(rs.getInt(ANSWERID));
                    answer.setStrAnswer(rs.getString(ANSWER));
                    answer.setiUserId(rs.getInt(USERID));
                    answer.setDate(rs.getDate(DATE));
                    answer.setIupvote(rs.getInt(UPVOTE));
                    
                    list.add(answer);
                    
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
