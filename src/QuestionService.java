import java.util.Scanner;

public class QuestionService {

    Question [] questions =new Question[5];
    String selection [] =new String [5];

    public QuestionService()
    {
        questions[0]= new Question(1,"size of int","Java","Cpp","python","csharp","java");
        questions[1]= new Question(1,"size of double","Java","Cpp","python","csharp","java");
        questions[2]= new Question(1,"size of char","Java","Cpp","python","csharp","java");
        questions[3]= new Question(1,"size of long","Java","Cpp","python","csharp","java");
        questions[4]= new Question(1,"size of boolean","Java","Cpp","python","csharp","java");

    }
    

    public void playQuiz()
    {       int i=0;
            for(Question q:questions){
            System.out.println("question no :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc=new Scanner(System.in);
            selection[i]= sc.nextLine();
            i++;
            }
            for (String s : selection)
            {
                System.out.println(s);
            }
        

    }
    public void printScore()
    {
        int score =0;
        for (int i=0;i<questions.length;i++)
        {
            Question que =questions[i];
            String actualAnswer= que.getAnswer();
            String userAnswer= selection[i];

            if (actualAnswer.equals(userAnswer))
            {
                    score++;
            }
        }
        System.out.println("Your Score is :" + score);
    }



}