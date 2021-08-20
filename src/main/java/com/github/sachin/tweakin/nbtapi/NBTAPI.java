package com.github.sachin.tweakin.nbtapi;

import javax.annotation.Nonnull;

// import com.github.sachin.tweakin.nbtapi.nms.NBTItem_1_16_R1;
// import com.github.sachin.tweakin.nbtapi.nms.NBTItem_1_16_R2;
import com.github.sachin.tweakin.nbtapi.nms.NBTItem_1_16_R3;
import com.github.sachin.tweakin.nbtapi.nms.NBTItem_1_17_R1;
import com.github.sachin.tweakin.nbtapi.nms.NMSHelper;

import org.bukkit.plugin.java.JavaPlugin;

public class NBTAPI {

    private static NBTAPI instance;
    private NMSHelper NMSHelper;

    public NBTAPI(){
        instance = this;
    }

    public boolean loadVersions(@Nonnull JavaPlugin plugin,String version){

        
        if(version.equals("v1_16_R3")){
            NMSHelper = new NBTItem_1_16_R3(null);
            return true;
        }
        // else if(version.equals("v1_16_R1")){
        //     NMSHelper = new NBTItem_1_16_R1(null);
        //     return true;
        // }
        // else if(version.equals("v1_16_R2")){
        //     NMSHelper = new NBTItem_1_16_R2(null);
        //     return true;
        // }
        else if(version.equals("v1_17_R1")){
            NMSHelper = new NBTItem_1_17_R1(null);
            return true;
        }
        return false;
        
    }

    public NMSHelper getNMSHelper() {
        return NMSHelper;
    }

    public static NBTAPI getInstance() {
        return instance;
    }

}
