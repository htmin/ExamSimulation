package tm.com.sg.examsimulation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScreenSlidePageFragment extends Fragment {
    WebView webView = null;
    TextView textView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);

        webView = (WebView) rootView.findViewById(R.id.webView);
        String summary = "<html><body>You scored <b>192</b> points.</body></html>";
        webView.loadData(summary, "text/html", null);

        textView = (TextView) rootView.findViewById(R.id.txView);
        textView.setText("Good");
        textView.setVisibility(View.GONE);
        textView.postDelayed(new Runnable(){
            @Override
            public void run()
            {
                textView.setVisibility(View.VISIBLE);
            }
        }, 10000);

        return rootView;
    }

}
