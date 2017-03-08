package uk.co.tickertalk.webview.utility;

import android.content.Context;
import android.webkit.JavascriptInterface;

/**
 * Created by ceri on 07/03/2017.
 */

public class WebViewJavaScriptInterface {

    Context mContext;

    /** Instantiate the interface and set the context */
    public WebViewJavaScriptInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void ajaxDone(String uid) {
        int bp = 0;
    }
}
