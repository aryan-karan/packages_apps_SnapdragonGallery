/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: vendor/tinno/tinnoapps/MyosGallery2/src/com/android/gallery3d/filtershow/filters/vignette.rs
 */

package com.android.gallery3d.filtershow.filters;

import android.content.res.Resources;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.Matrix3f;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/**
 * @hide
 */
public class ScriptC_vignette extends ScriptC {
    private static final String __rs_resource_name = "vignette";
    private final static int mExportVarIdx_inputWidth = 0;
    private final static int mExportVarIdx_inputHeight = 1;
    private final static int mExportVarIdx_centerx = 2;
    private final static int mExportVarIdx_centery = 3;
    private final static int mExportVarIdx_radiusx = 4;
    private final static int mExportVarIdx_radiusy = 5;
    private final static int mExportVarIdx_strength = 6;
    private final static int mExportVarIdx_finalBright = 7;
    private final static int mExportVarIdx_finalSaturation = 8;
    private final static int mExportVarIdx_finalContrast = 9;
    private final static int mExportVarIdx_finalSubtract = 10;
    private final static int mExportVarIdx_colorMatrix = 11;
    private final static int mExportVarIdx_scalex = 12;
    private final static int mExportVarIdx_scaley = 13;
    private final static int mExportVarIdx_offset = 14;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_vignette = 1;
    private final static int mExportFuncIdx_setupVignetteParams = 0;
    private Element __F32;
    private Element __U32;
    private Element __U8_4;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_U32;
    private long mExportVar_inputWidth;
    private long mExportVar_inputHeight;
    private float mExportVar_centerx;
    private float mExportVar_centery;
    private float mExportVar_radiusx;
    private float mExportVar_radiusy;
    private float mExportVar_strength;
    private float mExportVar_finalBright;
    private float mExportVar_finalSaturation;
    private float mExportVar_finalContrast;
    private float mExportVar_finalSubtract;
    private Matrix3f mExportVar_colorMatrix;
    private float mExportVar_scalex;
    private float mExportVar_scaley;
    private float mExportVar_offset;

    // Constructor
    public ScriptC_vignette(RenderScript rs) {
        this(rs,
                rs.getApplicationContext().getResources(),
                rs.getApplicationContext().getResources().getIdentifier(
                        __rs_resource_name, "raw",
                        rs.getApplicationContext().getPackageName()));
    }
    public ScriptC_vignette(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __U32 = Element.U32(rs);
        __F32 = Element.F32(rs);
        __U8_4 = Element.U8_4(rs);
    }

    public long get_inputWidth() {
        return mExportVar_inputWidth;
    }

    public synchronized void set_inputWidth(long v) {
        if (__rs_fp_U32 != null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_inputWidth, __rs_fp_U32);
        mExportVar_inputWidth = v;
    }

    public Script.FieldID getFieldID_inputWidth() {
        return createFieldID(mExportVarIdx_inputWidth, null);
    }

    public long get_inputHeight() {
        return mExportVar_inputHeight;
    }

    public synchronized void set_inputHeight(long v) {
        if (__rs_fp_U32 != null) {
            __rs_fp_U32.reset();
        } else {
            __rs_fp_U32 = new FieldPacker(4);
        }
        __rs_fp_U32.addU32(v);
        setVar(mExportVarIdx_inputHeight, __rs_fp_U32);
        mExportVar_inputHeight = v;
    }

    public Script.FieldID getFieldID_inputHeight() {
        return createFieldID(mExportVarIdx_inputHeight, null);
    }

    public float get_centerx() {
        return mExportVar_centerx;
    }

    public synchronized void set_centerx(float v) {
        setVar(mExportVarIdx_centerx, v);
        mExportVar_centerx = v;
    }

    public Script.FieldID getFieldID_centerx() {
        return createFieldID(mExportVarIdx_centerx, null);
    }

    public float get_centery() {
        return mExportVar_centery;
    }

    public synchronized void set_centery(float v) {
        setVar(mExportVarIdx_centery, v);
        mExportVar_centery = v;
    }

    public Script.FieldID getFieldID_centery() {
        return createFieldID(mExportVarIdx_centery, null);
    }

    public float get_radiusx() {
        return mExportVar_radiusx;
    }

    public synchronized void set_radiusx(float v) {
        setVar(mExportVarIdx_radiusx, v);
        mExportVar_radiusx = v;
    }

    public Script.FieldID getFieldID_radiusx() {
        return createFieldID(mExportVarIdx_radiusx, null);
    }

    public float get_radiusy() {
        return mExportVar_radiusy;
    }

    public synchronized void set_radiusy(float v) {
        setVar(mExportVarIdx_radiusy, v);
        mExportVar_radiusy = v;
    }

    public Script.FieldID getFieldID_radiusy() {
        return createFieldID(mExportVarIdx_radiusy, null);
    }

    public float get_strength() {
        return mExportVar_strength;
    }

    public synchronized void set_strength(float v) {
        setVar(mExportVarIdx_strength, v);
        mExportVar_strength = v;
    }

    public Script.FieldID getFieldID_strength() {
        return createFieldID(mExportVarIdx_strength, null);
    }

    public float get_finalBright() {
        return mExportVar_finalBright;
    }

    public synchronized void set_finalBright(float v) {
        setVar(mExportVarIdx_finalBright, v);
        mExportVar_finalBright = v;
    }

    public Script.FieldID getFieldID_finalBright() {
        return createFieldID(mExportVarIdx_finalBright, null);
    }

    public float get_finalSaturation() {
        return mExportVar_finalSaturation;
    }

    public synchronized void set_finalSaturation(float v) {
        setVar(mExportVarIdx_finalSaturation, v);
        mExportVar_finalSaturation = v;
    }

    public Script.FieldID getFieldID_finalSaturation() {
        return createFieldID(mExportVarIdx_finalSaturation, null);
    }

    public float get_finalContrast() {
        return mExportVar_finalContrast;
    }

    public synchronized void set_finalContrast(float v) {
        setVar(mExportVarIdx_finalContrast, v);
        mExportVar_finalContrast = v;
    }

    public Script.FieldID getFieldID_finalContrast() {
        return createFieldID(mExportVarIdx_finalContrast, null);
    }

    public float get_finalSubtract() {
        return mExportVar_finalSubtract;
    }

    public synchronized void set_finalSubtract(float v) {
        setVar(mExportVarIdx_finalSubtract, v);
        mExportVar_finalSubtract = v;
    }

    public Script.FieldID getFieldID_finalSubtract() {
        return createFieldID(mExportVarIdx_finalSubtract, null);
    }

    public Matrix3f get_colorMatrix() {
        return mExportVar_colorMatrix;
    }

    public synchronized void set_colorMatrix(Matrix3f v) {
        mExportVar_colorMatrix = v;
        FieldPacker fp = new FieldPacker(36);
        fp.addMatrix(v);
        setVar(mExportVarIdx_colorMatrix, fp);
    }

    public Script.FieldID getFieldID_colorMatrix() {
        return createFieldID(mExportVarIdx_colorMatrix, null);
    }

    public float get_scalex() {
        return mExportVar_scalex;
    }

    public synchronized void set_scalex(float v) {
        setVar(mExportVarIdx_scalex, v);
        mExportVar_scalex = v;
    }

    public Script.FieldID getFieldID_scalex() {
        return createFieldID(mExportVarIdx_scalex, null);
    }

    public float get_scaley() {
        return mExportVar_scaley;
    }

    public synchronized void set_scaley(float v) {
        setVar(mExportVarIdx_scaley, v);
        mExportVar_scaley = v;
    }

    public Script.FieldID getFieldID_scaley() {
        return createFieldID(mExportVarIdx_scaley, null);
    }

    public float get_offset() {
        return mExportVar_offset;
    }

    public synchronized void set_offset(float v) {
        setVar(mExportVarIdx_offset, v);
        mExportVar_offset = v;
    }

    public Script.FieldID getFieldID_offset() {
        return createFieldID(mExportVarIdx_offset, null);
    }

    public Script.KernelID getKernelID_vignette() {
        return createKernelID(mExportForEachIdx_vignette, 59, null, null);
    }

    public void forEach_vignette(Allocation ain, Allocation aout) {
        forEach_vignette(ain, aout, null);
    }

    public void forEach_vignette(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
                (t0.getX() != t1.getX()) ||
                (t0.getY() != t1.getY()) ||
                (t0.getZ() != t1.getZ()) ||
                (t0.hasFaces() != t1.hasFaces()) ||
                (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_vignette, ain, aout, null, sc);
    }

    public void invoke_setupVignetteParams() {
        invoke(mExportFuncIdx_setupVignetteParams);
    }

}

