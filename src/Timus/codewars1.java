package Timus;

//GrowthOfAPopulation

public class codewars1 {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int inhabitants = p0;
        while(inhabitants < p)
        {
            inhabitants = (int)(inhabitants + (inhabitants * (float)(percent/100)) + aug);
            years++;
        }
        return years;
    }
}