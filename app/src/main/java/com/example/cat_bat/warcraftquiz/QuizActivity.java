/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.cat_bat.justjava
 * If you get an error when copying this code into Android studio, update it to match the package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.cat_bat.warcraftquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    TextView questionA1;
    TextView questionA2;
    TextView questionA3;
    TextView questionA4;
    TextView questionA5;
    TextView reportFooter;
    TextView questionNum;
    int Question = 1;
    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Used to change the question number.
        questionNum = findViewById(R.id.question_number_text_view);

        // Used to display question answers at the end of quiz.
        questionA1 = findViewById(R.id.answer_one_text_view);
        questionA2 = findViewById(R.id.answer_two_text_view);
        questionA3 = findViewById(R.id.answer_three_text_view);
        questionA4 = findViewById(R.id.answer_four_text_view);
        questionA5 = findViewById(R.id.answer_five_text_view);
        reportFooter = findViewById(R.id.footer2_text_view);

        // Used to change button text.
        // Top-left button.
        Button1 = findViewById(R.id.button);
        // Top-right button.
        Button2 = findViewById(R.id.button2);
        // Bottom-left button.
        Button3 = findViewById(R.id.button3);
        // Bottom-right button.
        Button4 = findViewById(R.id.button4);

        // Automatically called when quiz is started.
        questionOne(findViewById(R.id.question_msg_text_view));
        Question++;
    }

    // Finds the given TextView and replaces the text in the view
    // with any function or string passed into the parameter.
    private void displayQuestion(String message) {
        TextView questionTextView = findViewById(R.id.question_msg_text_view);
        questionTextView.setText(message);
    }

    /**
     * @param view changes question and button text.
     */
    public void questionOne(View view) {
        String questionOne = "What faction did the Nightborne side with?";
        displayQuestion(questionOne);
        Button1.setText(R.string.alliance);
        Button2.setText(R.string.horde);
        Button3.setText(R.string.booty_bay);
        Button4.setText(R.string.kirin_tor);
        Toast.makeText(this, R.string.good_luck, Toast.LENGTH_SHORT).show();
    }

    /**
     * @param view changes question and button text.
     */
    public void questionTwo(View view) {
        String questionTwo = "What faction did the Void Elves side with?";
        displayQuestion(questionTwo);
        Button1.setText(R.string.horde);
        Button2.setText(R.string.alliance);
        Button3.setText(R.string.kirin_tor);
        Button4.setText(R.string.booty_bay);
    }

    /**
     * @param view changes question and button text.
     */
    public void questionThree(View view) {
        String questionThree = "Who turned Sylvannas Windrunner into a banshee?";
        displayQuestion(questionThree);
        Button1.setText(R.string.arthas);
        Button2.setText(R.string.ner_zhul);
        Button3.setText(R.string.medivh);
        Button4.setText(R.string.aegwynn);
    }

    /**
     * @param view changes question and button text.
     */
    public void questionFour(View view) {
        String questionFour = "Who defeated King Varian Wrynn?";
        displayQuestion(questionFour);
        Button1.setText(R.string.sargeras);
        Button2.setText(R.string.kil_jaeden);
        Button3.setText(R.string.archimonde);
        Button4.setText(R.string.gul_dan);
    }

    /**
     * @param view changes question and button text.
     */
    public void questionFive(View view) {
        String questionFive = "What is the name of the Life-Binder?";
        displayQuestion(questionFive);
        Button1.setText(R.string.aman_thul);
        Button2.setText(R.string.aggramar);
        Button3.setText(R.string.eonar);
        Button4.setText(R.string.ysera);
    }

    /**
     * This method sets the question_msg_text_view,
     * and the four button choices to be invisible.
     */
    public void setViewsVisible() {
        TextView questionMsg = findViewById(R.id.question_msg_text_view);

        questionMsg.setVisibility(View.VISIBLE);
        Button1.setVisibility(View.VISIBLE);
        Button2.setVisibility(View.VISIBLE);
        Button3.setVisibility(View.VISIBLE);
        Button4.setVisibility(View.VISIBLE);
    }

    /**
     * This method sets the question_msg_text_view,
     * and the four button choices to be visible.
     */
    public void setViewsInvisible() {
        TextView questionMsg = findViewById(R.id.question_msg_text_view);

        questionMsg.setVisibility(View.INVISIBLE);
        Button1.setVisibility(View.INVISIBLE);
        Button2.setVisibility(View.INVISIBLE);
        Button3.setVisibility(View.INVISIBLE);
        Button4.setVisibility(View.INVISIBLE);
    }

    /**
     * This method displays the answers to the quiz.
     * Buttons and question_msg_text_view are made invisible.
     * @param view creates the "Quiz Summary" layout.
     */
    public void quizReport(View view) {
        setViewsInvisible();
        questionNum.setText(R.string.quiz_summary);

        questionA1.setVisibility(View.VISIBLE);
        questionA1.setText(R.string.answer_one);

        questionA2.setVisibility(View.VISIBLE);
        questionA2.setText(R.string.answer_two);

        questionA3.setVisibility(View.VISIBLE);
        questionA3.setText(R.string.answer_three);

        questionA4.setVisibility(View.VISIBLE);
        questionA4.setText(R.string.answer_four);

        questionA5.setVisibility(View.VISIBLE);
        questionA5.setText(R.string.answer_five);

        reportFooter.setVisibility(View.VISIBLE);
        reportFooter.setText(R.string.footer2);
    }

    /**
     * Called when the user tap the "Restart" button.
     * This function brings the user back to question one,
     * @param view restarts the quiz.
     */
    public void restartQuiz(View view) {
        Question = 1;
        Question++;

        setViewsVisible();
        questionA1.setVisibility(View.INVISIBLE);
        questionA2.setVisibility(View.INVISIBLE);
        questionA3.setVisibility(View.INVISIBLE);
        questionA4.setVisibility(View.INVISIBLE);
        questionA5.setVisibility(View.INVISIBLE);
        reportFooter.setVisibility(View.INVISIBLE);
        questionNum.setText(R.string.question_one);
        questionOne(findViewById(R.id.question_msg_text_view));
    }

    /**
     * Called when the user taps the "Home" button.
     * This function brings the user back to MainActivity,
     * and simultaneously calls the restartQuiz function.
     * @param view brings the user to MainActivity.
     */
    public void homeActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /**
     * Called when the user taps the "Next" button.
     * Each time the button is tapped, the next question
     * is displayed on the screen.
     * @param view continues the quiz.
     */
    public void nextQuestion(View view) {
        if (Question == 2)
        {
            questionNum.setText(R.string.question_two);
            questionTwo(findViewById(R.id.question_msg_text_view));
            Question++;
        }
        else if (Question == 3)
        {
            questionNum.setText(R.string.question_three);
            questionThree(findViewById(R.id.question_msg_text_view));
            Question++;
        }
        else if (Question == 4)
        {
            questionNum.setText(R.string.question_four);
            questionFour(findViewById(R.id.question_msg_text_view));
            Question++;
        }
        else if (Question == 5)
        {
            questionNum.setText(R.string.question_five);
            questionFive(findViewById(R.id.question_msg_text_view));
            Question++;
        }
        else if (Question == 6)
        {
            quizReport(findViewById(R.id.question_number_text_view));
        }
    }

}
