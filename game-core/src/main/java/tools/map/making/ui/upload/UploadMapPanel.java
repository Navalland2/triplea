package tools.map.making.ui.upload;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import org.triplea.swing.JButtonBuilder;
import org.triplea.swing.JTextAreaBuilder;
import org.triplea.swing.jpanel.JPanelBuilder;

public class UploadMapPanel {

  public static JPanel build() {
    final JButton loginButton = new JButtonBuilder("Lobby Login").build();
    final JTextArea loginStatus = buildTextArea();

    final JButton selectMapButton = new JButtonBuilder("Select Map").enabled(false).build();
    final JTextArea mapStatus = buildTextArea();

    final JButton uploadButton = new JButtonBuilder("Upload").enabled(false).build();
    final JTextArea uploadStatus = buildTextArea();

    return new JPanelBuilder()
        .borderLayout()
        .addCenter(
            new JPanelBuilder()
                .gridLayout(6, 2)
                .add(new JPanel())
                .add(new JPanel())
                .add(loginButton)
                .add(loginStatus)
                .add(new JPanel())
                .add(new JPanel())
                .add(selectMapButton)
                .add(mapStatus)
                .add(new JPanel())
                .add(new JPanel())
                .add(uploadButton)
                .add(uploadStatus)
                .build())
        .build();
  }

  private static JTextArea buildTextArea() {
    return new JTextAreaBuilder().rows(3).columns(20).readOnly().build();
  }
}
