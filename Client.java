public class Client{

  public static void main(String[] args){
    
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
    College college = context.getBean("college", College.class)
    System.out.print("The college created by Spring is:" + College.Name);
    college.test();
    context.close();  
  }

}
