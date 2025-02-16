package OPP.Buoi2;
import java.util.ArrayList;
import java.util.Collections;
public class bai2_3 {
public static void main(String[] args) {
    String q1=(" bạn có thích hoc java khong");
    String q2=(" bạn có thích học ngon ngu nao");
    String q3=(" bạn có thích nghe nhac gi");

    ArrayList<String> questionList= new ArrayList<>();

    questionList.add(q1);
    questionList.add(q1);
    questionList.add(q3);

    // xáo trộn
    Collections.shuffle(questionList);
// in các câu hỏi
for( String q:questionList){
    System.out.println(q);
}

}
    
}
