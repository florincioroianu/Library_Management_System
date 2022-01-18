package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Author {
    
    private int id;
    private String firstName;
    private String lastName;
    private String field_Of_Expertise;
    private String about;

    
    public Author(){}
    
    public Author(int _id, String _fname, String _lname, String _expertise, String _about)
    {
        this.id = _id;
        this.firstName = _fname;
        this.lastName = _lname;
        this.field_Of_Expertise = _expertise;
        this.about = _about;
    }
    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setField_Of_Expertise(String field_Of_Expertise) {
        this.field_Of_Expertise = field_Of_Expertise;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getField_Of_Expertise() {
        return field_Of_Expertise;
    }

    public String getAbout() {
        return about;
    }
    
    
    // functions
    
    My_Classes.Func_Class func = new Func_Class();
    
    // insert a new author function
    public void addAuthor(String _fname,String _lname,String _expertise,String _about)
    {
        String insertQuery = "INSERT INTO `author`(`firstName`, `lastName`, `expertise`, `about`) VALUES (?,?,?,?)";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _expertise);
            ps.setString(4, _about);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Autorul a fost adaugat","add author",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Autorul nu a fost adaugat","add author",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    // edit author by id
    public void editAuthor(int _id, String _fname,String _lname,String _expertise,String _about)
    {
        String editQuery = "UPDATE `author` SET `firstName`=?,`lastName`=?,`expertise`=?,`about`=? WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _expertise);
            ps.setString(4, _about);
            ps.setInt(5, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Autorul a fost editat","edit author",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Autorul nu a fost editat","edit author",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    // remove author by id
    public void removeAuthor(int _id )
    {
        String removeQuery = "DELETE FROM `author` WHERE `id` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
            ps.setInt(1, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Autorul a fost sters","remove",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Autorul nu a fost sters","remove",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    // function to populate an array with authors
    public ArrayList<Author> authorsList()
    {
        ArrayList<Author> aList = new ArrayList<>();
        
        try {
            
            ResultSet rs = func.getData("SELECT * FROM `author`");
            
            Author author;
            
            while(rs.next())
            {    
                author = new Author(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("expertise"), rs.getString("about"));
                aList.add(author);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return aList;
    }
    
    
    // function to get author by id
    public Author getAuthorById(Integer id)
    {
      ResultSet rs = func.getData("SELECT * FROM `author` where id = "+id);
            
            Author author = null;
            
        try {
            if(rs.next())
            {    
                author = new Author(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("expertise"), rs.getString("about"));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return author;
    }
    
}
