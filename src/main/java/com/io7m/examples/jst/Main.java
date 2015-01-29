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

import java.awt.Dimension;

import javax.swing.SwingUtilities;

public final class Main
{
  public static void main(
    final String[] args)
  {
    SwingUtilities.invokeLater(new Runnable() {
      public void run()
      {
        final MainWindow w = new MainWindow();
        w.setPreferredSize(new Dimension(640, 480));
        w.pack();
        w.setVisible(true);
      }
    });
  }
}
