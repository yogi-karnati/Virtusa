class  ParameterizedConst{  
    int id;  
    String name;  
   
    ParameterizedConst(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    void display(){System.out.println(id+" "+name);}  
    
   
    public static void main(String args[]){  
   
    ParameterizedConst s1 = new  ParameterizedConst(111,"Kiran");  
     ParameterizedConst s2 = new  ParameterizedConst(222,"Shyam");  
    
    s1.display();  
    s2.display();  
   }  
}
