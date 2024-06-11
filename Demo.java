public class Demo {
    public static void main (String[] args){
        Person liam = new Person("Coach Liam", 25, "M");
        System.out.println(liam);  
    
        Student broken = new Student ("Broken again" , 18, "F", "BA2314", 3);
        System.out.println(broken);

        Teacher mrknow = new Teacher ("know legde", 40, "M", "Science", 25000);
        System.out.println(mrknow);

        CollegeStudent oh = new CollegeStudent("Oh hnot", 23, "M", "OH3492", 3.7, 4, "Communications");
        System.out.println(oh);

}
}
