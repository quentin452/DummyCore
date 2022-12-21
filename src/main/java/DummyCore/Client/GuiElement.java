package DummyCore.Client;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

public abstract class GuiElement {
    int zLevel = 0;

    public abstract ResourceLocation getElementTexture();

    public abstract void draw(int posX, int posY);

    public abstract int getX();

    public abstract int getY();

    public void drawTexturedModalRect(int x, int y, int textureX, int textureY, int width, int height) {
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(
                (double) (x + 0),
                (double) (y + height),
                (double) this.zLevel,
                (double) ((float) (textureX + 0) * f),
                (double) ((float) (textureY + height) * f1));
        tessellator.addVertexWithUV(
                (double) (x + width),
                (double) (y + height),
                (double) this.zLevel,
                (double) ((float) (textureX + width) * f),
                (double) ((float) (textureY + height) * f1));
        tessellator.addVertexWithUV(
                (double) (x + width),
                (double) (y + 0),
                (double) this.zLevel,
                (double) ((float) (textureX + width) * f),
                (double) ((float) (textureY + 0) * f1));
        tessellator.addVertexWithUV(
                (double) (x + 0),
                (double) (y + 0),
                (double) this.zLevel,
                (double) ((float) (textureX + 0) * f),
                (double) ((float) (textureY + 0) * f1));
        tessellator.draw();
    }

    public void drawTexturedModelRectFromIcon(int x, int y, IIcon icon, int width, int height) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(
                (double) (x + 0), (double) (y + height), (double) this.zLevel, (double) icon.getMinU(), (double)
                        icon.getMaxV());
        tessellator.addVertexWithUV(
                (double) (x + width), (double) (y + height), (double) this.zLevel, (double) icon.getMaxU(), (double)
                        icon.getMaxV());
        tessellator.addVertexWithUV(
                (double) (x + width), (double) (y + 0), (double) this.zLevel, (double) icon.getMaxU(), (double)
                        icon.getMinV());
        tessellator.addVertexWithUV(
                (double) (x + 0), (double) (y + 0), (double) this.zLevel, (double) icon.getMinU(), (double)
                        icon.getMinV());
        tessellator.draw();
    }

    public static void func_146110_a(
            int x, int y, float u, float v, int width, int height, float textureWidth, float textureHeight) {
        float f4 = 1.0F / textureWidth;
        float f5 = 1.0F / textureHeight;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(
                (double) x, (double) (y + height), 0.0D, (double) (u * f4), (double) ((v + (float) height) * f5));
        tessellator.addVertexWithUV(
                (double) (x + width), (double) (y + height), 0.0D, (double) ((u + (float) width) * f4), (double)
                        ((v + (float) height) * f5));
        tessellator.addVertexWithUV(
                (double) (x + width), (double) y, 0.0D, (double) ((u + (float) width) * f4), (double) (v * f5));
        tessellator.addVertexWithUV((double) x, (double) y, 0.0D, (double) (u * f4), (double) (v * f5));
        tessellator.draw();
    }

    public static void func_152125_a(
            int x,
            int y,
            float u,
            float v,
            int uWidth,
            int vHeight,
            int width,
            int height,
            float tileWidth,
            float tileHeight) {
        float f4 = 1.0F / tileWidth;
        float f5 = 1.0F / tileHeight;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(
                (double) x, (double) (y + height), 0.0D, (double) (u * f4), (double) ((v + (float) vHeight) * f5));
        tessellator.addVertexWithUV(
                (double) (x + width), (double) (y + height), 0.0D, (double) ((u + (float) uWidth) * f4), (double)
                        ((v + (float) vHeight) * f5));
        tessellator.addVertexWithUV(
                (double) (x + width), (double) y, 0.0D, (double) ((u + (float) uWidth) * f4), (double) (v * f5));
        tessellator.addVertexWithUV((double) x, (double) y, 0.0D, (double) (u * f4), (double) (v * f5));
        tessellator.draw();
    }
}
