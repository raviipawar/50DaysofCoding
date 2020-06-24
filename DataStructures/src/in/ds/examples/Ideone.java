package in.ds.examples;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {

        ZoneId z = ZoneId.of( "America/Montreal" );
        LocalDate today = LocalDate.now( z );

        List<String> dayNames = new ArrayList<>( 7 ) ;  // Initialize to seven days of a week.
        dayNames.add( "yesterday" ) ;
        dayNames.add( "today" ) ;
        for( int i = 1 ; i <= 5 ; i ++ ) {
            LocalDate ld = today.plusDays( i ) ;
            String dayName = ld.getDayOfWeek().getDisplayName( TextStyle.FULL , Locale.US ) ;
            dayNames.add( dayName ) ;  // Add each of the five days remaining in a week.
        }

        System.out.println( dayNames ) ;

        int currentDay;
        currentDay = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        String daysList[] = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};

        String daysWeek[] = {"Yesterday", "Today", daysList[currentDay], daysList[(currentDay+1)%7]};

        for(int i = 0 ; i < 7 ; i++){
            System.out.println(daysWeek.length);
        }

    }
}
