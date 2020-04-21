package Viewer;

public class GeneradorDeViewer {
    public InterfaceDataViewer getViewerPorString(String viewer){
        switch (viewer){
            case "text":
                return new TextDataViewer();
            case "html":
                return new HTMLDataViewer();
        }
        return new TextDataViewer();
    }
}
