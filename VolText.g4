/**
 * Define a grammar called Hello
 */
grammar VolText;

// match keyword hello followed by an identifier
pdf : 		A (stylesheet)? (page)+ C;

stylesheet: 'stylesheet' O element* C;
		
element: 	VAL O attrStyle* C;
	
attrStyle: 	imgattr 
	| 		txtattr 
	|  		listattr 
	| 		divattr;
	
page: 		'page' O pae* C;

pae: 		pageattr | elemp;

elemp: 		img 
	| 		'div' O divae* C;
	
divae:		divattr | elemd;
	
elemd: 		text 
	| 		list 
	| 		elemp;
	
img: 		'img' O imgattr* imgElem imgattr* C;

imgElem: 	'URL:"' URL ENDLINE;

text: 		'text' O txtattr* txtElem? txtattr* C;

txtElem: 	'Text:' STRING ENDNLINE;

list: 		'list' O lae* C;

lae: 		listattr | listElem;

listElem: 	'item:' STRING ENDNLINE;


//ATTRIBUTES
pageattr:	'id:"' VAL ENDLINE;

divattr: 	'id:"' VAL ENDLINE 
	| 		IMGANUMBER ':' NVAL ENDNLINE;
	
listattr: 	'ordered:' TFVAL ENDNLINE;

txtattr: 	'id:"' VAL ENDLINE 
	| 		'font-family:"' SVAL ENDLINE 
	| 		(IMGANUMBER | 'font-size') ':' NVAL ENDNLINE 
	| 		'color:' COLORVAL ENDNLINE 
	| 		TXTATF ':' TFVAL ENDNLINE 
	| 		'position:' POSVAL ENDNLINE;
	
imgattr: 	'id:"' VAL ENDLINE 
	| 		IMGANUMBER ':' NVAL ENDNLINE 
	| 		'position:' POSVAL ENDNLINE;


//TERMINALI

TXTATF: 	'bold'
	| 		'italics'
	|		'underline';

COLORVAL: 	'#' ([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]);

SVAL: 		[a-zA-Z]+;

TFVAL: 		't' 
	| 		'f';

IMGANUMBER: 'pos-x'
		|	'pos-y'
		|	'angle-rotation'
		|	'h-img'
		|	'w-img'
		| 	'layer';

POSVAL: 	'lu' 
	| 		'cu' 
	| 		'ru' 
	| 		'lc' 
	| 		'cc' 
	| 		'rc' 
	| 		'lb' 
	| 		'cb' 
	| 		'rb' ;

NVAL: 		[0-9]+('.'[0-9]+)?;

ENDLINE: 	'";';
ENDNLINE: 	';';

O : 		':{';
A : 		'{';
C : 		'}';

SPECIALC: 	'pga'		//{
		|	'pgc'		//}
		|	'sq'		//'
		|	'dq'		//"
		|	'bs'		//\
		|	'dp'		//:
		|	'pv'		//;
		|	'pp'		//.
		|	'ss'		///
		;
		
STRING: 	'"' (~[\t\r\n])+ '"';

URL: 		(VAL ':' '/' [/]? | './' | '../' ) URL2 ;

URL2: 		VAL '/' URL2 | VAL '.' VAL;		

VAL : 		([A-Z] | [a-z] | [0-9])+;

WS : 		[ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

