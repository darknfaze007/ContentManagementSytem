/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentManagementSystem;

/**
 *
 * @author Kariyawasam
 */
public class Paper {
   private String paperId;
   private String title;
   private String CorrespondingAuthorId;
   private String authors[];

    public Paper() {
    }

    public Paper(String paperId, String title, String CorrespondingAuthorId, String[] authors) {
        this.paperId = paperId;
        this.title = title;
        this.CorrespondingAuthorId = CorrespondingAuthorId;
        this.authors = authors;
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCorrespondingAuthorId() {
        return CorrespondingAuthorId;
    }

    public void setCorrespondingAuthorId(String CorrespondingAuthorId) {
        this.CorrespondingAuthorId = CorrespondingAuthorId;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
   
}
