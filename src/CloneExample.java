class CloneExample implements Cloneable {

 private String name;
 private String designation;

 public CloneExample() {
 this.setDesignation("Programmer");
 }
 public String getDesignation() {
 return designation;
 }

 public void setDesignation(String designation) {
 this.designation = designation;
 }

 public String getName() {
 return name;
 }

 public void setName(String name) {
 this.name = name;
 }

 public Object clone() throws CloneNotSupportedException {
 /*
 Employee copyObj = new Employee();
 copyObj.setDesignation(this.designation);
 copyObj.setName(this.name);
 return copyObj;
 */
 return super.clone();
 }
}

public class CloneExample {
 public static void main(String arg[]){
 CloneExample jwz = new CloneExample();
 jwz.setName("Jamie Zawinski");
 try {
 CloneExample joel = (CloneExample) jwz.clone();
 System.out.println(joel.getName());
 System.out.println(joel.getDesignation());
 } catch (CloneNotSupportedException cnse) {
 System.out.println("Cloneable should be implemented. " + cnse );
 }
 }
}