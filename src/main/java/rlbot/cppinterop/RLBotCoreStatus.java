package rlbot.cppinterop;

public enum RLBotCoreStatus {
    SUCCESS,
    BUFFER_OVERFILLED,
    MESSAGE_LARGER_THAN_MAX,
    INVALID_NUM_PLAYERS,
    INVALID_BOT_SKILL,
    INVALID_HUMAN_INDEX,
    INVALID_NAME,
    INVALID_TEAM,
    INVALID_TEAM_COLOR_ID,
    INVALID_CUSTOM_COLOR_ID,
    INVALID_GAME_VALUES,
    INVALID_THROTTLE,
    INVALID_STEER,
    INVALID_PITCH,
    INVALID_YAW,
    INVALID_ROLL,
    INVALID_PLAYER_INDEX,
    INVALID_QUICK_CHAT_PRESET,
    INVALID_RENDER_TYPE,
    QUICK_CHAT_RATE_EXCEEDED,
    NOT_INITIALIZED;

    public static RLBotCoreStatus fromDllResult(int dllResult) {
        return RLBotCoreStatus.values()[dllResult];
    }
}
