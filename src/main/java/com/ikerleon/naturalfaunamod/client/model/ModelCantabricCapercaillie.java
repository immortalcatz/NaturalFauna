package com.ikerleon.naturalfaunamod.client.model;

import org.zawamod.client.model.llibrary.AdvancedModelBase;
import org.zawamod.client.model.llibrary.AdvancedModelRenderer;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCantabricCapercaillie extends AdvancedModelBase {
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer RightThigh;
    public AdvancedModelRenderer LeftThigh;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer RightWing;
    public AdvancedModelRenderer LeftWing;
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer RightLeg;
    public AdvancedModelRenderer LeftLeg;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Peak;
    public AdvancedModelRenderer PeakBase;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Tail4;

    public ModelCantabricCapercaillie() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Body2 = new AdvancedModelRenderer(this, 23, 26);
        this.Body2.mirror = true;
        this.Body2.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.Body2.addBox(-3.0F, 0.0F, 0.0F, 6, 5, 1, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 31, 0);
        this.Tail2.setRotationPoint(0.5F, 1.5F, 1.0F);
        this.Tail2.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail2, -0.5918411493512771F, 0.0F, -0.11379546723003027F);
        this.Tail1 = new AdvancedModelRenderer(this, 48, 0);
        this.Tail1.setRotationPoint(1.0F, 1.5F, 1.0F);
        this.Tail1.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail1, -0.5918411493512771F, 0.0F, -0.22759093446006054F);
        this.LeftLeg = new AdvancedModelRenderer(this, 4, 23);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(0.0F, -1.5F, -0.75F);
        this.LeftLeg.addBox(0.3F, 0.0F, -3.0F, 3, 5, 4, 0.0F);
        this.Tail5 = new AdvancedModelRenderer(this, 48, 0);
        this.Tail5.setRotationPoint(-1.0F, 1.5F, 1.0F);
        this.Tail5.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail5, -0.5918411493512771F, 0.0F, 0.23387411976724018F);
        this.Head = new AdvancedModelRenderer(this, 13, 0);
        this.Head.setRotationPoint(0.0F, -1.9F, 1.3F);
        this.Head.addBox(-2.0F, -2.9F, -2.9F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Head, -0.136659280431156F, 0.0F, 0.0F);
        this.Peak = new AdvancedModelRenderer(this, 0, 10);
        this.Peak.setRotationPoint(0.0F, -2.0F, -2.8F);
        this.Peak.addBox(-1.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Peak, 0.31869712141416456F, 0.0F, 0.0F);
        this.PeakBase = new AdvancedModelRenderer(this, 0, 10);
        this.PeakBase.setRotationPoint(-2.5F, -1.2F, -2.0F);
        this.PeakBase.addBox(1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(PeakBase, -0.18203784098300857F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 0, 0);
        this.Neck.setRotationPoint(0.5F, -3.15F, -3.9F);
        this.Neck.addBox(-2.0F, -2.0F, -0.6F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Neck, 0.22759093446006054F, 0.0F, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 38, 19);
        this.Body.setRotationPoint(0.0F, 18.1F, 0.0F);
        this.Body.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 7, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 31, 0);
        this.Tail4.setRotationPoint(-0.5F, 1.5F, 1.0F);
        this.Tail4.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail4, -0.5918411493512771F, 0.0F, 0.11379546723003027F);
        this.RightThigh = new AdvancedModelRenderer(this, 5, 15);
        this.RightThigh.setRotationPoint(0.0F, 2.4F, 1.0F);
        this.RightThigh.addBox(-3.0F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
        this.RightWing = new AdvancedModelRenderer(this, 25, 10);
        this.RightWing.setRotationPoint(-3.0F, -2.5F, -2.5F);
        this.RightWing.addBox(-0.6F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(RightWing, -0.23387411976724018F, -0.05235987755982988F, 0.0F);
        this.RightLeg = new AdvancedModelRenderer(this, 4, 23);
        this.RightLeg.setRotationPoint(0.0F, -1.5F, -0.75F);
        this.RightLeg.addBox(-3.3F, 0.0F, -3.0F, 3, 5, 4, 0.0F);
        this.LeftWing = new AdvancedModelRenderer(this, 25, 10);
        this.LeftWing.mirror = true;
        this.LeftWing.setRotationPoint(3.0F, -2.5F, -2.5F);
        this.LeftWing.addBox(-0.4F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
        this.setRotateAngle(LeftWing, -0.22759093446006054F, 0.05235987755982988F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 48, 0);
        this.Tail3.setRotationPoint(0.0F, 1.5F, 1.0F);
        this.Tail3.addBox(-1.0F, -0.1F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Tail3, -0.5918411493512771F, 0.0F, 0.0F);
        this.LeftThigh = new AdvancedModelRenderer(this, 5, 15);
        this.LeftThigh.mirror = true;
        this.LeftThigh.setRotationPoint(0.0F, 2.4F, 1.0F);
        this.LeftThigh.addBox(0.0F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
        this.Body.addChild(this.Body2);
        this.Body2.addChild(this.Tail2);
        this.Body2.addChild(this.Tail1);
        this.LeftThigh.addChild(this.LeftLeg);
        this.Body2.addChild(this.Tail5);
        this.Neck.addChild(this.Head);
        this.Head.addChild(this.Peak);
        this.Head.addChild(this.PeakBase);
        this.Body.addChild(this.Neck);
        this.Body2.addChild(this.Tail4);
        this.Body.addChild(this.RightThigh);
        this.Body.addChild(this.RightWing);
        this.RightThigh.addChild(this.RightLeg);
        this.Body.addChild(this.LeftWing);
        this.Body2.addChild(this.Tail3);
        this.Body.addChild(this.LeftThigh);
        
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.5F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.Body.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
        this.Body.render(f5);
    	}
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
        ModelRenderer.rotateAngleX = x;
        ModelRenderer.rotateAngleY = y;
        ModelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) 
    {
    	super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	resetToDefaultPose();
    	
    	float globalSpeed = 2f;
    	float globalHeight = 0.5f;
    	float globalDegree = 2.5F;
    	
    	bob(Body, globalSpeed, globalHeight, true, f, f1);
    	
    	walk(LeftLeg, 1.5f * globalSpeed, 0.25f * globalDegree, false, 0, 0.2f, f, f1);
     	walk(RightLeg, 1.5f * globalSpeed, 0.25f * globalDegree, true, 0, 0.2f, f, f1);
     	walk(Neck, 1f * globalSpeed, 0.25f * globalDegree, false, 0, 0f, f, f1);
     	walk(Body2, 1f * globalSpeed, 0.35f * globalDegree, false, 0, 0f, f, f1);
     	
     	walk(Neck, 0.17f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(Body2, 0.2f, 0.08f, false, 2.5f, 0f, entity.ticksExisted, 0.5F);   	
     	walk(LeftWing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
     	walk(RightWing, 0.17f, 0.04f, true, 2.5f, 0f, entity.ticksExisted, 0.5F);
    }
}
