![](https://media.giphy.com/media/KGkz7MLPW8rjZpy92P/giphy.gif)



To use this library:
Firstly Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	} 
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Tgalshemeri:ClearAbleEditText:1.0'
	}
  
  Add this line to the layout:
    
    <com.treaf.clearableedittext.ClearableEditText android:layout_width="match_parent" android:layout_height="wrap_content"/>

  
  
  
