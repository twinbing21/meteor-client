import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("RasterProvider")
public final class RasterProvider extends AbstractRasterProvider {
    @ObfuscatedName("f")
    Component component;
    @ObfuscatedName("w")
    Image image;

   RasterProvider(int var1, int var2, Component var3) {
      super.width = var1;
      super.height = var2;
      super.pixels = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.pixels, super.pixels.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.width, super.height), var4, (Point)null);
      this.image = new BufferedImage(var5, var6, false, new Hashtable());
      this.setComponent(var3);
      this.apply();
   }

    @ObfuscatedName("f")
    @ObfuscatedSignature(
            descriptor = "(Ljava/awt/Component;I)V",
            garbageValue = "1334791189"
    )
    final void setComponent(Component var1) {
      this.component = var1;
   }

    @ObfuscatedName("w")
    @ObfuscatedSignature(
            descriptor = "(IIB)V",
            garbageValue = "44"
    )
    public final void drawFull(int var1, int var2) {
      this.drawFull0(this.component.getGraphics(), var1, var2);
   }

    @ObfuscatedName("v")
    @ObfuscatedSignature(
            descriptor = "(IIIIB)V",
            garbageValue = "-68"
    )
    public final void draw(int var1, int var2, int var3, int var4) {
      this.draw0(this.component.getGraphics(), var1, var2, var3, var4);
   }

    @ObfuscatedName("s")
    @ObfuscatedSignature(
            descriptor = "(Ljava/awt/Graphics;III)V",
            garbageValue = "-1792511799"
    )
    final void drawFull0(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.image, var2, var3, this.component);
      } catch (Exception var5) {
         this.component.repaint();
      }

   }

    @ObfuscatedName("z")
    @ObfuscatedSignature(
            descriptor = "(Ljava/awt/Graphics;IIIIB)V",
            garbageValue = "1"
    )
    final void draw0(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.image, 0, 0, this.component);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.component.repaint();
      }

   }
}
