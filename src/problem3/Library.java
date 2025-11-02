package problem3;

import javax.print.Doc;
import java.lang.constant.DynamicCallSiteDesc;
import java.util.ArrayList;

public class Library{
    private int capacity;
    private ArrayList<Document> documents;

    // Constructor:
    public Library(int capacity) {
        this.capacity = capacity;
        this.documents = new ArrayList<Document>(capacity);
    }

    // display Documents:
    public void displayDocuments(){
        System.out.println("Library's content: {");
        for (Document doc: documents){
            if (doc != null){
                System.out.println(doc + ",");
            }
        }
        System.out.println("}");
    }
    // add document:
    public boolean add(Document doc){
        if (documents.size() != capacity){
            documents.add(doc);
            return true;
        }
        return false;
    }
    // delete document:
    public boolean deleteDocument(Document doc){
        if (documents.contains(doc)) {
            documents.remove(doc);
            return true;
        }
        return false;
    }
    // document:
    public Document document(int numRec){
        for(Document doc: documents){
            if (doc.getNumRec() == numRec){
                return doc;
            }
        }
        return null;
    }
    // display author:
    public void displayAuthors(){
        System.out.println("Authors : {");
        for( Document doc: documents){
            if(doc instanceof Book){
                System.out.println(((Book) doc).getAuthor() +",");
            }
        }
        System.out.println("}");
    }

}
