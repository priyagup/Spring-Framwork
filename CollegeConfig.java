@Configure
@ComponentScan({com.package.college}) // Or you can write (Basepackage = "com.package.college")
@PropertySource("classpath: college-info.properties")
public class CollegeConfig{

}
