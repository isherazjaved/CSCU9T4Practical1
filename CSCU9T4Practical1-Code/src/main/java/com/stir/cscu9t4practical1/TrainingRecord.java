// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
 
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }

public String FindAllEntry(int d, int m, int y) {
	// TODO Auto-generated method stub
	return null;
}
public String getEntriesByDate(Date date) {
    StringBuilder sb = new StringBuilder();
    boolean found = false;
    for (Entry entry : entries) {
        if (entry.getDay().equals(Date)) {
            found = true;
            sb.append(entry.toString()).append("\n");
        }
    }
    if (!found) {
        sb.append("No entries found for ").append(date.toString());
    }
    return sb.toString();
}

public String getAllEntriesOnDate(Date date) {
	// TODO Auto-generated method stub
	return null;
}

public boolean removeEntry(Entry e) {
	// TODO Auto-generated method stub
	return false;
}
}
   
 // TrainingRecord