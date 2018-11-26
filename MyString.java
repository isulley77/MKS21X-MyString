public class MyString implements CharSequence,Comparable<CharSequence>{
  
    private char[] data;
  
  
    //Constructor
    public MyString(CharSequence s){ 
    
        //initalizes char array
        data = new char[s.length()];
        
        //adds chars from CharSequence to array
        for(int i = 0; i < s.length(); i++){
            data[i] = s.charAt(i);
        }
    }

    public char charAt(int index){
        
        //returns char
        return data[index];
    }
    
    public int length(){
        
        //returns length of CharSequence
        return data.length;
    }
    
    public CharSequence subSequence(int start, int end){
    
        //checks that start and end are within range
        if(start < 0 || end < 0 || start > length() || end > length()){
            throw new IndexOutOfBoundsException();
        }
        
        //String is-a CharSequence
        String cs = "";
        
        //adds char to string
        for(int i = start; i < end; i++){
            
            cs += charAt(i);
            
        }
        
        return cs;
        
        }
        
    public String toString(){
        
        String str = "";
        
        //adds char to string
        for(int i = 0; i < length(); i++){
            
            str += charAt(i);
        }
        return str;
    }
    
    public int compareTo(CharSequence seq){
    
        return 1;
    }

  }
