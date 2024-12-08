package work7;

public class Parents {
    private  String  name;
        private  int  age;
        private  String  sex;
        
        public  String  getName()  {
                return  name;
        }
        
        public  void  setName(String  name)  {
                this.name  =  name;
        }
        
        public  int  getAge()  {
                return  age;
        }
        
        public  void  setAge(int  age)  {
                this.age  =  age;
        }
        
        public  String  getSex()  {
                return  sex;
        }
        
        public  void  setSex(String  sex)  {
                this.sex  =  sex;
        }
        
        public  void  getInfo()  {
                System.out.println("my  name  is:  "  +  getName());
                System.out.println("my  age  is:  "  +  getAge());
                System.out.println("my  sex  is:  "  +  getSex());
        }  
}
