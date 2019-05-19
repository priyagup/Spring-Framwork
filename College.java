


@Component
public class College{

  private Strng CollegeName;
  
  @Autowired
  private Principle principal;
  
  @Autowired
  @Qualifier("ScienceTeacher")
  private Teacher teacher;
  
  @Required
  @Value("${College.Name}")
  public void SetCollegeName(String collegeName){
  this.college = CollegeName;
  }
  
  public void test(){
  principal principalInfo();
  teacher.tech()
  System.out.print("My college Name:" + collegeName);
  }
}
  
  
