package com.brandonang.heading5;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.webkit.WebView;
import android.view.View;

public class Heading5 extends AndroidNonvisibleComponent {

  public Heading5(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public void CreateHeading5(AndroidViewComponent webViewer, String text){
    View view = webViewer.getView();
    WebView webView = (WebView) view;
    String heading5 = "<h5>" + text + "</h5>";
    webView.loadDataWithBaseURL("", heading5, "text/html", "UTF-8", "");
  }
}
