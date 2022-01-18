
package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Issue_Book {

   private int book_id;
   private int member_id;
   private String status; 
   private String issue_date;
   private String Return_date;
   private String note; 

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public void setReturn_date(String Return_date) {
        this.Return_date = Return_date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getBook_id() {
        return book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public String getStatus() {
        return status;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public String getReturn_date() {
        return Return_date;
    }

    public String getNote() {
        return note;
    }

    public Book getBook() {
        return book;
    }

    public Issue_Book() {
    }

    public Issue_Book(int _book_id, int _member_id, String _status, String _issue_date, String _Return_date, String _note) {
        this.book_id = _book_id;
        this.member_id = _member_id;
        this.status = _status;
        this.issue_date = _issue_date;
        this.Return_date = _Return_date;
        this.note = _note;
    }
    
   
   Book book = new Book();
   Func_Class func = new Func_Class();
   
   
   public void addIssue(int _book_id, int _member_id, String _status, String _issue_date, String _return_date, String _note)
   {
       String insertQuery = "INSERT INTO `issue_book`(`book_id`, `member_id`, `status`, `issue_date`, `return_date`, `note`) VALUES (?,?,?,?,?,?)";
       
       try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setString(3, _status);
            ps.setString(4, _issue_date);
            ps.setString(5, _return_date);
            ps.setString(6, _note);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Imprumutul a fost inregistrat","add issue",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Imprumutul nu a fost inregistrat","add issue",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
   
   
   public void updateIssue(int _book_id, int _member_id, String _status,String _issue_date, String _return_date, String _note)
   {
       String updateQuery = "UPDATE `issue_book` SET `status`= ?,`return_date`= ?,`note`=? WHERE `book_id`=? AND `member_id`=? and `issue_date` = ?";
       
       try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
            
            
            ps.setString(1, _status);
            ps.setString(2, _return_date);
            ps.setString(3, _note);
            ps.setInt(4, _book_id);
            ps.setInt(5, _member_id);
            ps.setString(6, _issue_date);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Status actualizat","Book Issue",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Status neactualizat!","Book Issue",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   
   
   
   
   public boolean checkBookAvailability(int _book_id)
   {
       boolean availability = false;
       try {
           
           Book selectedBook = book.getBookById(_book_id);
           int quantity = selectedBook.getQuantity();
           
           
           int issued_book_count = countData(_book_id);
           
           if(quantity > issued_book_count)
           {
               availability = true;
           }
           else
           {
               availability = false;
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return availability;
   }
   
   
    public int countData(int _book_id)
    {
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;
        
        try {
            ps = DB.getConnection().prepareStatement("SELECT COUNT(*) as total FROM `issue_book` WHERE book_id = ? and `status` = 'issued'");
            
            ps.setInt(1, _book_id);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                total= rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    
     
    public ArrayList<Issue_Book> issuedBooksList(String _status)
    {
        
        ArrayList<Issue_Book> issuedBooksList = new ArrayList<>();
        String query;
        
        
        if(_status.equals("")) 
        {
            query = "SELECT * FROM `issue_book`";
        }
        else 
        {
            query = "SELECT * FROM `issue_book` WHERE `status` = '" + _status + "'";
        }
        
        
        try {  
            
            ResultSet rs = func.getData(query);
            
            Issue_Book issBook;
            
            while(rs.next())
            {    
                issBook = new Issue_Book(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getString(4),
                                    rs.getString(5), rs.getString(6));
                issuedBooksList.add(issBook);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return issuedBooksList;
    }
    
    
        
        
        
    public void removeFromIssuedTable(int _book_id, int _member_id, String _issued_date )
    {
        String removeQuery = "DELETE FROM `issue_book` WHERE `book_id`=? AND `member_id`=? AND `issue_date` = ?";
        
        try {
            
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            
            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setString(3, _issued_date);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Stergere cu succes","remove",1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Stergere fara succes","remove",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
