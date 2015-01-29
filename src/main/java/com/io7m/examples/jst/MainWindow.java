/*
 * This work is placed into the public domain for free use by anyone for any
 * purpose. It may be freely used, modified and distributed.
 *
 * In jurisdictions that do not recognise the public domain this work may be
 * freely used, modified and distributed without restriction.
 *
 * This work comes with absolutely no warranty.
 */

package com.io7m.examples.jst;

import java.awt.Container;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import com.jogamp.newt.awt.NewtCanvasAWT;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.util.Animator;

public final class MainWindow extends JFrame
{
  private static final long   serialVersionUID = -3513821808302505552L;
  private final NewtCanvasAWT canvas;

  MainWindow()
  {
    final GLProfile profile = GLProfile.getDefault();
    final GLCapabilities caps = new GLCapabilities(profile);
    final GLWindow gl_window = GLWindow.create(caps);
    gl_window.setSize(512, 512);
    gl_window.addGLEventListener(new MainGLEventListener());

    this.canvas = new NewtCanvasAWT(gl_window);
    final JPanel canvas_panel = new JPanel();
    canvas_panel.add(this.canvas);

    final JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(new JButton("One"));
    panel.add(new JButton("Two"));
    panel.add(new JButton("Three"));

    final JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    pane.add(canvas_panel);
    pane.add(panel);

    final Container c = this.getContentPane();
    c.add(pane);

    final Animator anim = new Animator(gl_window);
    anim.start();
  }
}
