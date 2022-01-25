
/**
 * Write a description of class Particapant_tracker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Particapant_tracker
{
    // instance variables - replace the example below with your own
    private int countSurvay1 = 0;
    private int countSurvay2 = 0;
    private int countSurvay3 = 0;
    private int countTrials = 0;
    private int temp = 0;
    /**
     * Constructor for objects of class Particapant_tracker
     */
    public Particapant_tracker()
    {
        while(countTrials < 100)
        {
            temp = getLowest();
            if(temp == 0)
            {
                countSurvay1++;
            }
            if(temp == 1)
            {
                countSurvay2++;
            }
            if(temp == 2)
            {
                countSurvay3++;
            }
            countTrials++;
        }
        System.out.println("S1="+countSurvay1+",S2="+countSurvay2+",S3="+countSurvay3);
    }

    public int getLowest()
    {
        int num = 0;
        int random = (int)Math.random()*2;
        if(countSurvay1 == countSurvay2 && countSurvay1 == countSurvay3)
        {
            num = 0;
        }
        else if(countSurvay1 > countSurvay3 && countSurvay1 > countSurvay2)
        {
            num = 1;
        }
        else if(countSurvay3 < countSurvay2 && countSurvay3 < countSurvay1)
        {
            num = 2;
        }
        return num;
    }
}
