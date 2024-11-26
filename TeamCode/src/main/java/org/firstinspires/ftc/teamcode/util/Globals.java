package org.firstinspires.ftc.teamcode.util;

import com.acmerobotics.dashboard.config.Config;

@Config
public class Globals {

    public static boolean LIMITS = true;

    public static boolean IS_AUTO = false;

    public static Alliance ALLIANCE = Alliance.RED;

    public enum Alliance {
        RED,
        BLUE
    }

}
