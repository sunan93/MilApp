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

/**
 *
 * @author User
 */
public class Blog {
    
    private static String BLOGID="BLOG_ID", BLOGTITLE="BLOG_TITLE",BLOGDESC="BLOG_DESC", USERID="USER_ID", UPVOTE="UPVOTE",CLUBID="CLUB_ID";
    private static String TABLE="BLOG";
    
    private String strBlogTitle,strBlogDesc;
    private int iBlogId,iUserId,iUpvote,iClubId;

   
    
    /**
     * @return the strBlogDesc
     */
    public String getStrBlogDesc() {
        return strBlogDesc;
    }

    /**
     * @param strBlogDesc the strBlogDesc to set
     */
    public void setStrBlogDesc(String strBlogDesc) {
        this.strBlogDesc = strBlogDesc;
    }

    /**
     * @return the strBlogTitle
     */
    public String getStrBlogTitle() {
        return strBlogTitle;
    }

    /**
     * @param strBlogTitle the strBlogTitle to set
     */
    public void setStrBlogTitle(String strBlogTitle) {
        this.strBlogTitle = strBlogTitle;
    }
    /**
     * @return the iBlogId
     */
    public int getiBlogId() {
        return iBlogId;
    }

    /**
     * @param iBlogId the iBlogId to set
     */
    public void setiBlogId(int iBlogId) {
        this.iBlogId = iBlogId;
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
    
    public void addBlog(Blog blog)
    {
         Connection con=null;
         PreparedStatement st = null;
       //  System.out.println(blog.getStrBlogTitle());
         
         try
         {
              con = (Connection) ConnectionFactory.getConnection();
              st = (PreparedStatement) con.prepareStatement("Insert into "+TABLE+" ( "+BLOGTITLE+","+BLOGDESC+","+USERID+","+UPVOTE+","+CLUBID+ ") values (? , ? , ? , ? , ? )");
              
              st.setString(1,blog.getStrBlogTitle());
              st.setString(2,blog.getStrBlogDesc());
              st.setInt(3,blog.getiUserId());
              st.setInt(4,blog.getiUpvote());
              st.setInt(5,blog.getiClubId());
              
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
    
    public static ArrayList<Blog> getAllBlogsByClubId(int clubid)
    {
         Connection con =null ;
         PreparedStatement st=null;
         ResultSet rs=null;
         ArrayList<Blog> list=new ArrayList<Blog>();
         
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
                    Blog blog=new Blog();
                    blog.setiBlogId(rs.getInt(BLOGID));
                    blog.setStrBlogTitle(rs.getString(BLOGTITLE));
                    blog.setStrBlogDesc(rs.getString(BLOGDESC));
                    blog.setiUpvote(rs.getInt(UPVOTE));
                    blog.setiUserId(rs.getInt(USERID));
                    blog.setiClubId(rs.getInt(CLUBID));
                    
                    list.add(blog);
                    
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

    public static ArrayList<Blog> getAllBlogsByUserId(int userid)
    {
         Connection con =null ;
         PreparedStatement st=null;
         ResultSet rs=null;
         ArrayList<Blog> list=new ArrayList<Blog>();
         
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
                    Blog blog=new Blog();
                    blog.setiBlogId(rs.getInt(BLOGID));
                    blog.setStrBlogTitle(rs.getString(BLOGTITLE));
                    blog.setStrBlogDesc(BLOGDESC);
                    blog.setiUpvote(rs.getInt(UPVOTE));
                    blog.setiUserId(rs.getInt(USERID));
                    blog.setiClubId(rs.getInt(CLUBID));
                    
                    list.add(blog);
                    
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
