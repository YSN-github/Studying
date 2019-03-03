package learnclass;

public class Test {
 private String name;
 public void he(){
	 System.out.println("name= "+name);
 }
 public String getname(){//直接の変数操作は煩雑の元？
	 return name;
 }
 public void setName(String name) {
	 this.name = name;//thisの優先順位
 }
}
