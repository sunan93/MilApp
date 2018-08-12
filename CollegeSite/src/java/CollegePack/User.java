package CollegePack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
//package arena.db.common.user;
//import java.sql.SQLException;
//import java.sql.DriverManager;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.sql.ResultSet;
//import arena.db.common.ConnectionFactory;
  import java.sql.*;
/*The user class is used the create a user object to access the data stored in the database. */
/* public class noUserFoundException extends Exception 
 {
       public  noUserFoundException()
       {
           super();
           
       }
 }
 */
 
 public class User {
   
   private String strUserName,strFirstName,strLastName,strEmailId,strPassword,strCity,strInstituteName,strYear;
   private int iUserId;
   private String strPlaceOfWork;
   
   private static String USERNAME="USER_NAME";
   private static String FIRSTNAME="FIRST_NAME";
   private static String LASTNAME="LAST_NAME";
   private static String EMAILID="EMAIL_ID";
   private static String PASSWORD="PASSWORD";
   //private static String CONTACTNO="CONTACT_NUMBER";
   //private static String HIGHESTDEGREE="HIGHEST_DEGREE";
   private static String CITY="CITY";
   private static String INSTITUTENAME="INSTITUTE_NAME";
  // private static String REGISTRATIONDATE="REGISTRATION_DATE";
   private static String USERID="USER_ID";
   private static String PLACEOFWORK="PLACE_OF_WORK";
   private static String YEAR="YEAR";
   private static String TABLE="USER";
   
   public User()
   {}
  
   /*The getter/setter function definitions are as follows.*/
   
   
  /*The following function is used to add user data to the database via a user object.*/
   public  void addUser(User user) 
  {
    Connection con=null;
    PreparedStatement st = null;
    try
    {
       
        con = (Connection) ConnectionFactory.getConnection();
        st = (PreparedStatement) con.prepareStatement("Insert into "+TABLE+" ( "+USERNAME+","+FIRSTNAME+","+LASTNAME+","+EMAILID+","+PASSWORD+","+INSTITUTENAME+","+CITY+","+PLACEOFWORK+","+YEAR+" ) values ( ? , ? , ? , ? , ? , ? , ? , ? ,? )");
        
        //st.setInt(1, user.getiUserId());
        st.setString(1,user.getStrUserName());
        st.setString(2, user.getStrFirstName());
        st.setString(3,user.getStrLastName());
        
        st.setString(4,user.getStrEmailId());
        st.setString(5,user.getStrPassword());
        st.setString(6,user.getStrInstituteName());
        st.setString(7,user.getStrCity());
        st.setString(8,user.getStrPlaceOfWork());
        st.setString(9,user.getStrYear());
        
        
        
        int res = st.executeUpdate();
     
        if(res>0)
        {
//            JOptionPane.showMessageDialog(null ,"Data added successfully ");
			System.out.println("Data added successfully ");
        }
        else
        {
//            JOptionPane.showMessageDialog(null , "Sorry !! Couldnt add your data ");
			System.out.println("Sorry !! Couldnt add your data ");
        }
    
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

  
  /*The following function is used to dispaly a list of all users in the database. It returns an array of user objects*/
   
  public static User getUserByUserId(int userid){
      
      Connection con=null;
      Statement st=null;
      ResultSet rs=null;
      User user=null;
      
      try{
          con=ConnectionFactory.getConnection();
          st=con.createStatement();
          String sql="select * from "+TABLE+" where "+USERID+" = "+userid;
          rs=st.executeQuery(sql);
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
          user=new User();
          user.setStrUserName(rs.getString(USERNAME));
          user.setStrFirstName(rs.getString(FIRSTNAME));
          user.setStrLastName(rs.getString(LASTNAME));
          user.setStrPassword(rs.getString(PASSWORD));
          user.setStrCity(rs.getString(CITY));
          user.setStrInstituteName(rs.getString(INSTITUTENAME));
          user.setStrEmailId(rs.getString(EMAILID));
          user.setiUserId(rs.getInt(USERID));
          user.setStrPlaceOfWork(rs.getString(PLACEOFWORK));
          user.setStrYear(rs.getString(YEAR));
      
          
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
     return user;
      
      
      
  }

  public static User[] getAllUsers() throws noUserFoundException
  {
    Connection conn ;
    Statement stmt=null;
    User user[]=null;
    ResultSet rset=null;
   
   try
   {
     //create a connection
     conn=ConnectionFactory.getConnection(); 
     try
     {
       stmt=conn.createStatement();
     }
     catch(SQLException se){
        // se.printStackTrace();
     }
     //Execute sql query to select all tuples from the table.
     String sql="SELECT * FROM "+TABLE;
    
     rset=stmt.executeQuery(sql);
       if(rset==null)
        {
           throw  new noUserFoundException();		
        }
      

   }
    catch(Exception e)//database exception
    {
    //   e.printStackTrace();
    }

     
     try
     {
       int i=0;
       //Insert the data extracted into an array of user objects
        while(rset.next())
        {
       
           user[i]=new User();
         
          user[i].setStrUserName(rset.getString(USERNAME));
          user[i].setStrFirstName(rset.getString(FIRSTNAME));
          user[i].setStrLastName(rset.getString(LASTNAME));
          user[i].setStrEmailId(rset.getString(EMAILID));
         //user.setContactNo(rset.getString(CONTACTNO));
          user[i].setStrPassword(rset.getString(PASSWORD));  
         //user.setHighestDegree(rset.getString(HIGHESTDEGREE));
          user[i].setStrCity(rset.getString(CITY));
          user[i].setStrInstituteName(rset.getString(INSTITUTENAME));
          user[i].setiUserId(rset.getInt(USERID));
          user[i].setStrYear(rset.getString(YEAR));
          user[i].setStrPlaceOfWork(rset.getString(PLACEOFWORK));
         //user.setScore(rset.getInt(SCORE));
         //user.setRegistrationDate(rset.getString(REGISTRATIONDATE));
         //user.setPhoto(rset.getString(PHOTO));
           //user[i].setPhoto(rset.getString("PHOTO"));
           i++;

        }

     }
     catch(SQLException se){
      //   se.printStackTrace();
     }
     catch(NullPointerException ne){
     }

    /* try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
  */
    return user;
  }


   /*The following function is used to return a user object containing details of the user
     with a particular username and password.*/
 
  public  static User getUser(String uname, String passwrd) //throws noUserFoundException
  {
        User user = null ;
        Connection con =null ;
        PreparedStatement st=null;
        ResultSet rs=null;
   
        try
        {
              con = ConnectionFactory.getConnection();
              //System.out.println("Select * from "+TABLE+" where "+USERNAME+" = '"+uname+"' and  "+PASSWORD+" = '"+passwrd+"'");
              st = con.prepareStatement("Select * from "+TABLE+" where "+USERNAME+" = '"+uname+"' and  "+PASSWORD+" = '"+passwrd+"'");
              rs = st.executeQuery();
              //System.out.println("login retrieval here");
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
                 System.out.println("retrning null");
                return null;
              }
              

     //Insert the data extracted into a user object
            user=new User();
            System.out.println("hello");
            user.setStrUserName(rs.getString(USERNAME));
            user.setStrFirstName(rs.getString(FIRSTNAME));
            user.setStrLastName(rs.getString(LASTNAME));
            user.setStrEmailId(rs.getString(EMAILID));
            //user.setContactNo(rset.getString(CONTACTNO));
            user.setStrPassword(rs.getString(PASSWORD));  
            //user.setHighestDegree(rset.getString(HIGHESTDEGREE));
            user.setStrCity(rs.getString(CITY));
            user.setStrInstituteName(rs.getString(INSTITUTENAME));
            user.setiUserId(rs.getInt(USERID));
            user.setStrYear(rs.getString(YEAR));
            user.setStrPlaceOfWork(rs.getString(PLACEOFWORK));
         //user.setScore(rset.getInt(SCORE));
         //user.setRegistrationDate(rset.getString(REGISTRATIONDATE));
         //user.setPhoto(rset.getString(PHOTO));
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
        return user;
    }
  

    /**
     * @return the strUserName
     */
    public String getStrUserName() {
        return strUserName;
    }

    /**
     * @param strUserName the strUserName to set
     */
    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    /**
     * @return the strFirstName
     */
    public String getStrFirstName() {
        return strFirstName;
    }

    /**
     * @param strFirstName the strFirstName to set
     */
    public void setStrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    /**
     * @return the strLastName
     */
    public String getStrLastName() {
        return strLastName;
    }

    /**
     * @param strLastName the strLastName to set
     */
    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    /**
     * @return the strEmailId
     */
    public String getStrEmailId() {
        return strEmailId;
    }

    /**
     * @param strEmailId the strEmailId to set
     */
    public void setStrEmailId(String strEmailId) {
        this.strEmailId = strEmailId;
    }

    /**
     * @return the strPassword
     */
    public String getStrPassword() {
        return strPassword;
    }

    /**
     * @param strPassword the strPassword to set
     */
    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    /**
     * @return the strCity
     */
    public String getStrCity() {
        return strCity;
    }

    /**
     * @param strCity the strCity to set
     */
    public void setStrCity(String strCity) {
        this.strCity = strCity;
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
     * @return the strPlaceOfWork
     */
    public String getStrPlaceOfWork() {
        return strPlaceOfWork;
    }

    /**
     * @param strPlaceOfWork the strPlaceOfWork to set
     */
    public void setStrPlaceOfWork(String strPlaceOfWork) {
        this.strPlaceOfWork = strPlaceOfWork;
    }

    /**
     * @return the strYear
     */
    public String getStrYear() {
        return strYear;
    }

    /**
     * @param strYear the strYear to set
     */
    public void setStrYear(String strYear) {
        this.strYear = strYear;
    }
 
} 
