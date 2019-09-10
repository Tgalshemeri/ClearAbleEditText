package com.treaf.clearableedittext

import android.content.Context
import android.support.v7.widget.AppCompatEditText
import android.util.AttributeSet
import android.view.MotionEvent

class ClearableEditText : AppCompatEditText {
    constructor(context: Context): super(context)
    constructor(context: Context , attributeSet: AttributeSet):super(context,attributeSet)
    constructor(context: Context , attributeSet: AttributeSet , defStyleAttr:Int):super(context,attributeSet,defStyleAttr)
    private val clearBtn = resources.getDrawable(R.drawable.baseline_close_black_24dp , null)

    override fun onTextChanged(text: CharSequence?, start: Int, lengthBefore: Int, lengthAfter: Int) {
        if (text!!.isNotEmpty()){
          showClearBtn()
        } else {
            hideClearBtn()
        }
        super.onTextChanged(text, start, lengthBefore, lengthAfter)
    }

    private fun hideClearBtn() {
        setCompoundDrawablesWithIntrinsicBounds(null , null , null ,null)
    }

    private fun showClearBtn() {
        setCompoundDrawablesWithIntrinsicBounds(null , null , clearBtn , null)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event!!.action == MotionEvent.ACTION_DOWN){
            var X = width - event.x.toInt()
            val Y = event.y.toInt()
            val bounds = clearBtn.bounds
            if (X<=0){
                X = event.x.toInt()
            }
            if (bounds.contains(X,Y)){
                text = null
                event.action = MotionEvent.ACTION_CANCEL
                return false
            }
            return super.onTouchEvent(event)
        }
        return super.onTouchEvent(event)
    }
}