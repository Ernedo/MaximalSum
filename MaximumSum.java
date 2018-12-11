public final class MaximumSum
{ 
static private int seqStart = 0; 
static private int seqEnd = -1; 

public static int maxSubSum3( int [ ] a ) 
{ 
int maxSum = 0; 
int thisSum = 0; 

for( int i = 0, j = 0; j < a.length; j++ ) 
{ 
thisSum += a[ j ]; 

if( thisSum > maxSum ) 
{ 
maxSum = thisSum; 
seqStart = i; 
seqEnd = j; 
} 
else if( thisSum < 0 ) 
{ 
i = j + 1; 
thisSum = 0; 
} 
} 

return maxSum; 
} 
public static void main( String [ ] args ) 
{ 
int a[ ] = { 12, -34, 40, 6, -10, 56, 12, -1, -15, 10 }; 
int maxSum; 


maxSum = maxSubSum3( a ); 
System.out.println( "Max shumes eshte" + maxSum + ";shkon" 
+ " nga " + seqStart + " te " + seqEnd ); 

} 
}