// leap year wala concept bhi lage g ??
// leap year me 366 days hote h

// year ko year se minus kre ge . month ko month se , date ko date se 
// no of days =year *365+ month *30/31/29 + day 
// agar pura logic laga to bahut lamba code ho jaye ga

// leap (n%4==0&&n%100!=0||n%400==0)


class Solution {
    public int daysBetweenDates(String date1, String date2) {return Math.abs(toDays(date1)-toDays(date2)); 
    }

    private int toDays(String date){
        String[] parts= date.split("-");
        int year =Integer.parseInt (parts[0]);
        int month=Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonth ={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDays=0;

        for(int y=1971;y<year;y++){
            totalDays+=isLeap(y)?366:365;
        }

        for(int m=1;m<month;m++){
            totalDays+=daysInMonth[m];

            if(m==2&&isLeap(year)){
                totalDays+=1;
            }
        }

        totalDays+=day;

        return totalDays;
    }

    private boolean isLeap(int y){
        return (y%4==0&&y%100!=0)||(y%400==0);
    }


    }


// Math.abs()  +ve banane k liyee
//     toDays(date1) - toDays(date2);  dono date k days nikal aur difference le lo is logic 