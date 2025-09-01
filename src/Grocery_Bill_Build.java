import javax.naming.ldap.StartTlsRequest;
import javax.xml.stream.events.EndDocument;

StartTlsRequest

INITALIZE arrays
        weeklyTotal[4]
        couponAmount[4]
        weeklyTotalWithCoupon[4]

FOR each week from 1 to 4:
    PROMPT user to enter coupon amount as decimal
    STORE input in couponAmount

FOR each couponAmount:
    IF couponAmount[i] < 0 OR > 1:
        DISPLAY "Invalid coupon amount. Default to 10%"
        SET couponAmount[i] to .10

FOR each week from 1 to 4:
    PROMPT user to enter weekly bill total
    SET input in weeklyTotal

CALCULATE weekly average
    SET average = sum of weeklyTotal values / 4

FOR each week from 1 to 4:
    CALCULATE discounted total :
        weeklyTotalWithCoupon = weeklyTotal - (weeklyTotal * couponAmount)

DISPLAY results WITHOUT coupon
        PRINT overall weekly average
        PRINT full weekly Total

DISPLAY results WITH coupon
        PRINT overall weeklyTotalWithCoupon
        CALCULATE totalWithCoupon = total of weeklyTotalWithCoupon
        CALCULATE weeklyAverageWithCoupon = totalWithCoupon / 4
        PRINT weeklyAverageWithCoupon
        PRINT monthlyTotalWithCoupon

EndDocument
