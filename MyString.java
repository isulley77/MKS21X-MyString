public class MyString implements CharSequence,Comparable<CharSequence>{
  
    private char[] data;
  
  
    //Constructor
    public MyString(CharSequence s){ 
    
        //initalizes char array
        data = new char[s.length()];
        
        //adds chars from CharSequence to array
        for(int i = 0, i < s.length(), i++){
            data[i] = s.charAt(i);
        }
    }

    public char charAt(int index){
        
        //returns char
        return data[i];
    }
    
    
    

  }
}


