package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelBase;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;

/**
 * Peregrine Falcon - Bolcko
 * Created using Tabula 7.0.0
 */
public class ModelPeregrineFalconChild extends BookwormModelBase {
    public BookwormModelRenderer body;
    public BookwormModelRenderer body2;
    public BookwormModelRenderer leftleg;
    public BookwormModelRenderer rightleg;
    public BookwormModelRenderer leftwing;
    public BookwormModelRenderer rightwing;
    public BookwormModelRenderer head;
    public BookwormModelRenderer beak;
    public BookwormModelRenderer beak2;
    public BookwormModelRenderer beak3;

    public ModelPeregrineFalconChild() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.body = new BookwormModelRenderer(this, 0, 0, "body");
        this.body.setRotationPoint(0.0F, 19.7F, 0.0F);
        this.body.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 6, 0.0F);
        this.setRotateAngle(body, -0.8377580409572781F, 0.0F, 0.0F);
        this.leftwing = new BookwormModelRenderer(this, 24, 1, "leftwing");
        this.leftwing.setRotationPoint(2.0F, -1.0F, -1.4F);
        this.leftwing.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(leftwing, 0.36425021489121656F, 0.0F, 0.0F);
        this.rightleg = new BookwormModelRenderer(this, 26, 0, "rightleg");
        this.rightleg.setRotationPoint(-1.0F, 1.8F, 1.5F);
        this.rightleg.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rightleg, 0.8206538142877338F, 0.0F, 0.0F);
        this.rightwing = new BookwormModelRenderer(this, 40, 1, "rightwing");
        this.rightwing.setRotationPoint(-2.0F, -1.0F, -1.4F);
        this.rightwing.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 6, 0.0F);
        this.setRotateAngle(rightwing, 0.36425021489121656F, 0.0F, 0.0F);
        this.beak2 = new BookwormModelRenderer(this, 48, 0, "beak2");
        this.beak2.setRotationPoint(0.0F, -1.2F, -3.0F);
        this.beak2.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak2, 0.7853981633974483F, 0.0F, 0.0F);
        this.body2 = new BookwormModelRenderer(this, 14, 0, "body2");
        this.body2.setRotationPoint(0.0F, 1.0F, 3.5F);
        this.body2.addBox(-1.5F, -2.5F, -0.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(body2, 0.6108652381980153F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 32, 0, "head");
        this.head.setRotationPoint(0.0F, -1.0F, -2.7F);
        this.head.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(head, 0.8293804605477054F, 0.0F, 0.0F);
        this.leftleg = new BookwormModelRenderer(this, 0, 0, "leftleg");
        this.leftleg.setRotationPoint(1.0F, 1.8F, 1.5F);
        this.leftleg.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(leftleg, 0.8346164483036883F, 0.0F, 0.0F);
        this.beak = new BookwormModelRenderer(this, 9, 11, "beak");
        this.beak.setRotationPoint(0.0F, -1.5F, -2.7F);
        this.beak.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(beak, 0.8726646259971648F, 0.0F, 0.0F);
        this.beak3 = new BookwormModelRenderer(this, 56, 0, "beak3");
        this.beak3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.beak3.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(beak3, -0.4623377188532979F, 0.0F, 0.0F);
        this.body.addChild(this.leftwing);
        this.body.addChild(this.rightleg);
        this.body.addChild(this.rightwing);
        this.head.addChild(this.beak2);
        this.body.addChild(this.body2);
        this.body.addChild(this.head);
        this.body.addChild(this.leftleg);
        this.head.addChild(this.beak);
        this.beak2.addChild(this.beak3);
        
	save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.body.render(f5);
    }

    public void setRotateAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	reset();

    	float globalSpeed = 1.75f;
    	float globalHeight = 0.5f;
    	float globalDegree = 1.5F;

        this.rightleg.rotateAngleX = 1F * f1 * (0.8f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + 0.8206538142877338F;
        this.leftleg.rotateAngleX = -1F * f1 * (0.8f * globalDegree) * MathHelper.cos(f * (0.5f * globalSpeed) + 0) + 0.8346164483036883F;
        this.head.rotateAngleX = -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.8f * globalSpeed) + 2.5f) + 0.8293804605477054F;
        this.body2.rotateAngleX = -1F * f1 * (0.1f * globalDegree) * MathHelper.cos(f * (0.8f * globalSpeed) + 2.5f) + 0.6108652381980153F;

        this.body2.rotateAngleX = 1F * 0.5F * (0.08f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + 0.6108652381980153F;
        this.head.rotateAngleX = 1F * 0.5F * (0.08f) * MathHelper.cos(entity.ticksExisted * (0.2f) + 2.5f) + 0.8293804605477054F;
        this.rightwing.rotateAngleX = -1F * 0.5F * (0.04f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + 0.36425021489121656F;
        this.leftwing.rotateAngleX = -1F * 0.5F * (0.04f) * MathHelper.cos(entity.ticksExisted * (0.17f) + 2.5f) + 0.36425021489121656F;
    }
}
