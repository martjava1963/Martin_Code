<?php 

/*						**PHP PROGRAMMING**
---------------------------------------------------------------------------
							*NOTES*
	Variable Functions - allow us to take input from somewhere
	and call any kind of function that pre-exist's 	based off of a string
	variable value.	ie: $func = 'add_up'; or $func = 'answer';

	
	
---------------------------------------------------------------------------
 */

/*====================FUNCTION DEFINITIONS BEGIN=========================*/

// VARIABLE FUNCTIONS
function answer() {
	return 45;	
}

function add_up($a, $b) {
	return $a + $b;
}

function subtractNums($a, $b) {
	return $a - $b;
	
}

//PHP CLOSURES or anonymous functions - can't access things outside the function definition or scope...

$name = 'Marty';
$greet = function() use ($name) {
	echo "Hello There, $name.";  // must use double qoutes because single quotes don't do evaluations...we need to evaluate $name
	echo '<br>';
	echo '<br>';
	echo "\n\nTesting Sublime Text Editor!";	
};




/*====================FUNCTION DEFINITIONS END===========================*/



/*----assign function to variable----*/

//$func = 'answer';

//$func = 'add_up';

$func = 'subtractNums';





/*=========================OUTPUTS BEGIN=================================*/

// VARIABLE FUNCTIONS OUTPUT
/*----call the function----*/ 

//echo $func();


// another way to do the same result
//$num = $func(10,200);

//echo "Num = " . $num;


//PHP CLOSURES OUTPUT
/*----call the function----*/ 

$greet();


/*==========================OUTPUTS END==================================*/


?>