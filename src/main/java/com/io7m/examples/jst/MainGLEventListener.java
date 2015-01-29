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

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

final class MainGLEventListener implements GLEventListener
{
  private double time;

  public void reshape(
    final GLAutoDrawable drawable,
    final int x,
    final int y,
    final int width,
    final int height)
  {
    // Resize any OpenGL resources (framebuffers, etc)
  }

  public void init(
    final GLAutoDrawable drawable)
  {
    // Do any initialization
  }

  public void dispose(
    final GLAutoDrawable drawable)
  {
    // Finish
  }

  public void display(
    final GLAutoDrawable drawable)
  {
    final GL gl = drawable.getGL();
    final float r = (float) Math.abs(Math.sin(this.time));
    final float g = (float) Math.abs(Math.sin(this.time + 0.3));
    final float b = (float) Math.abs(Math.sin(this.time + 0.6));
    gl.glClearColor(r, g, b, 1.0f);
    gl.glClear(GL.GL_COLOR_BUFFER_BIT);
    this.time += 0.01;
  }
}
