package com.archer.matching_card_game.two_cards.StoryMode;

import android.os.Build;

import com.archer.matching_card_game.two_cards.HelperClass;
import com.archer.matching_card_game.two_cards.R;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static com.archer.matching_card_game.two_cards.HelperClass.BOTH;
import static com.archer.matching_card_game.two_cards.HelperClass.CARD_SET_1;
import static com.archer.matching_card_game.two_cards.HelperClass.CARD_SET_2;
import static com.archer.matching_card_game.two_cards.HelperClass.CARD_SET_3;
import static com.archer.matching_card_game.two_cards.HelperClass.ONE_BOARD;
import static com.archer.matching_card_game.two_cards.HelperClass.TWO_BOARD;
import static com.archer.matching_card_game.two_cards.HelperClass.VERTICAL;

public class GameValues {

    int Module_index;
    int Level_index;
    int Stage_index;
    int Challenge_index;
    int ModuleLevelCount[] = {18,8,4,8,15,17,11};
    int CardSets[][][]=
            {
                    //region module : "Love Affair"
                    {
                            {
                                    R.drawable.card_heart_t1_3, R.drawable.card_heart_t3_6, R.drawable.card_heart_t4_3,
                                    R.drawable.card_heart_t5_6, R.drawable.card_heart_t6_8, R.drawable.card_heart_t8_7
                            },
                            {
                                    R.drawable.card_heart_t5_1, R.drawable.card_heart_t5_2, R.drawable.card_heart_t5_3,
                                    R.drawable.card_heart_t5_4, R.drawable.card_heart_t5_5, R.drawable.card_heart_t5_6
                            },
                            {
                                    R.drawable.card_heart_t2_1, R.drawable.card_heart_t2_2, R.drawable.card_heart_t2_3,
                                    R.drawable.card_heart_t2_4, R.drawable.card_heart_t2_5, R.drawable.card_heart_t2_6,
                                    R.drawable.card_heart_t2_7, R.drawable.card_heart_t2_8
                            },
                            {
                                    R.drawable.card_heart_t3_1, R.drawable.card_heart_t3_2, R.drawable.card_heart_t3_3,
                                    R.drawable.card_heart_t3_4, R.drawable.card_heart_t3_5, R.drawable.card_heart_t3_6,
                                    R.drawable.card_heart_t3_7, R.drawable.card_heart_t3_8
                            },
                            {
                                    R.drawable.card_heart_t4_1, R.drawable.card_heart_t4_2, R.drawable.card_heart_t4_3,
                                    R.drawable.card_heart_t4_4, R.drawable.card_heart_t4_5, R.drawable.card_heart_t4_6,
                                    R.drawable.card_heart_t4_7, R.drawable.card_heart_t4_8
                            },
                            {
                                    R.drawable.card_heart_t1_1, R.drawable.card_heart_t1_2, R.drawable.card_heart_t1_3,
                                    R.drawable.card_heart_t1_4, R.drawable.card_heart_t1_5, R.drawable.card_heart_t1_6,
                                    R.drawable.card_heart_t1_7, R.drawable.card_heart_t1_8
                            },
                            {
                                    R.drawable.card_heart_t6_1, R.drawable.card_heart_t6_2, R.drawable.card_heart_t6_3,
                                    R.drawable.card_heart_t6_4, R.drawable.card_heart_t6_5, R.drawable.card_heart_t6_6,
                                    R.drawable.card_heart_t6_7, R.drawable.card_heart_t6_8
                            },
                            {
                                    R.drawable.card_heart_t8_1, R.drawable.card_heart_t8_2, R.drawable.card_heart_t8_3,
                                    R.drawable.card_heart_t8_4, R.drawable.card_heart_t8_5, R.drawable.card_heart_t8_6,
                                    R.drawable.card_heart_t8_7, R.drawable.card_heart_t8_8
                            },
                            {
                                    R.drawable.card_heart_t10_1, R.drawable.card_heart_t10_2, R.drawable.card_heart_t10_3,
                                    R.drawable.card_heart_t10_4, R.drawable.card_heart_t10_5, R.drawable.card_heart_t10_6,
                                    R.drawable.card_heart_t1_1, R.drawable.card_heart_t2_1
                            },
                            {
                                    R.drawable.card_heart_t1_8, R.drawable.card_heart_t2_7, R.drawable.card_heart_t3_8,
                                    R.drawable.card_heart_t4_7, R.drawable.card_heart_t5_6, R.drawable.card_heart_t7_8,
                            },
                            {
                                    R.drawable.card_heart_t1_2, R.drawable.card_heart_t2_2, R.drawable.card_heart_t3_3,
                                    R.drawable.card_heart_t4_3, R.drawable.card_heart_t5_2, R.drawable.card_heart_t6_2,
                                    R.drawable.card_heart_t7_2, R.drawable.card_heart_t8_3, R.drawable.card_heart_t8_4,
                            },
                            {
                                    R.drawable.card_heart_t11, R.drawable.card_heart_t1_3, R.drawable.card_heart_t2_3,
                                    R.drawable.card_heart_t6_3, R.drawable.card_heart_t6_8, R.drawable.card_heart_t7_3,
                                    R.drawable.card_heart_t7_7, R.drawable.card_heart_t5_1, R.drawable.card_heart_t4_1,
                                    R.drawable.card_heart_t3_1
                            },
                            {
                                    R.drawable.card_heart_t1_5, R.drawable.card_heart_t2_4, R.drawable.card_heart_t3_4,
                                    R.drawable.card_heart_t4_4, R.drawable.card_heart_t5_3, R.drawable.card_heart_t6_4,
                                    R.drawable.card_heart_t7_4, R.drawable.card_heart_t8_5, R.drawable.card_heart_t8_6,
                            },
                            {
                                    R.drawable.card_heart_t1_4, R.drawable.card_heart_t1_7, R.drawable.card_heart_t2_6,
                                    R.drawable.card_heart_t2_8, R.drawable.card_heart_t3_5, R.drawable.card_heart_t6_6,
                                    R.drawable.card_heart_t7_6, R.drawable.card_heart_t8_7//
                            },
                            {
                                    R.drawable.card_heart_t1_6, R.drawable.card_heart_t2_5, R.drawable.card_heart_t3_6,
                                    R.drawable.card_heart_t4_5, R.drawable.card_heart_t5_4, R.drawable.card_heart_t6_5,
                                    R.drawable.card_heart_t7_5, R.drawable.card_heart_t8_2//
                            },
                            {
                                    R.drawable.card_heart_t9_1, R.drawable.card_heart_t9_10, R.drawable.card_heart_t9_11,
                                    R.drawable.card_heart_t9_13, R.drawable.card_heart_t9_15, R.drawable.card_heart_t9_16,
                                    R.drawable.card_heart_t9_2, R.drawable.card_heart_t9_3, R.drawable.card_heart_t9_4,
                                    R.drawable.card_heart_t9_5, R.drawable.card_heart_t9_6, R.drawable.card_heart_t9_7,
                                    R.drawable.card_heart_t9_8, R.drawable.card_heart_t9_9, R.drawable.card_heart_t4_2,
                                    R.drawable.card_heart_t3_2

                            },
                            {
                                    R.drawable.card_heart_t10_6, R.drawable.card_heart_t11, R.drawable.card_heart_t1_1,
                                    R.drawable.card_heart_t1_2, R.drawable.card_heart_t1_6, R.drawable.card_heart_t2_1,
                                    R.drawable.card_heart_t2_2, R.drawable.card_heart_t2_5, R.drawable.card_heart_t3_6,
                                    R.drawable.card_heart_t4_5, R.drawable.card_heart_t6_4, R.drawable.card_heart_t7_4,
                                    R.drawable.card_heart_t8_7, R.drawable.card_heart_t8_8, R.drawable.card_heart_t8_5,
                                    R.drawable.card_heart_t8_6
                            },
                            {
                                    R.drawable.card_heart_t1_5, R.drawable.card_heart_t1_6, R.drawable.card_heart_t2_3,
                                    R.drawable.card_heart_t2_4, R.drawable.card_heart_t2_6, R.drawable.card_heart_t2_7,
                                    R.drawable.card_heart_t2_8, R.drawable.card_heart_t5_3, R.drawable.card_heart_t5_6,
                                    R.drawable.card_heart_t6_5, R.drawable.card_heart_t6_6, R.drawable.card_heart_t7_2,
                                    R.drawable.card_heart_t7_5, R.drawable.card_heart_t7_6, R.drawable.card_heart_t8_3,
                                    R.drawable.card_heart_t8_4, R.drawable.card_heart_t8_7, R.drawable.card_heart_t8_8,
                            }
                    },
                    //endregion

                    //region module : "Thunder-bolt"
                    {
                            {
                                    R.drawable.card_thunder_bolt_t1_1, R.drawable.card_thunder_bolt_t3_5, R.drawable.card_thunder_bolt_t3_7,
                                    R.drawable.card_thunder_bolt_t4_1, R.drawable.card_thunder_bolt_t5_4, R.drawable.card_thunder_bolt_t6_5,
                            },
                            {
                                    R.drawable.card_thunder_bolt_t1_3, R.drawable.card_thunder_bolt_t1_8, R.drawable.card_thunder_bolt_t2_3,
                                    R.drawable.card_thunder_bolt_t3_10, R.drawable.card_thunder_bolt_t3_5, R.drawable.card_thunder_bolt_t4_11,
                                    R.drawable.card_thunder_bolt_t4_5, R.drawable.card_thunder_bolt_t5_17, R.drawable.card_thunder_bolt_t8_3,
                            },
                            {
                                    R.drawable.card_thunder_bolt_t1_1, R.drawable.card_thunder_bolt_t2_1, R.drawable.card_thunder_bolt_t3_11,
                                    R.drawable.card_thunder_bolt_t3_9, R.drawable.card_thunder_bolt_t5_20, R.drawable.card_thunder_bolt_t5_21,
                                    R.drawable.card_thunder_bolt_t6_12, R.drawable.card_thunder_bolt_t6_6, R.drawable.card_thunder_bolt_t8_2,
                                    R.drawable.card_thunder_bolt_t8_1
                            },
                            {
                                    R.drawable.card_thunder_bolt_t3_10, R.drawable.card_thunder_bolt_t3_11, R.drawable.card_thunder_bolt_t3_12,
                                    R.drawable.card_thunder_bolt_t3_9, R.drawable.card_thunder_bolt_t3_4, R.drawable.card_thunder_bolt_t3_5,
                                    R.drawable.card_thunder_bolt_t3_6, R.drawable.card_thunder_bolt_t3_7, R.drawable.card_thunder_bolt_t3_8,
                                    R.drawable.card_thunder_bolt_t3_2
                            },
                            {
                                    R.drawable.card_thunder_bolt_t4_1, R.drawable.card_thunder_bolt_t4_2, R.drawable.card_thunder_bolt_t4_3,
                                    R.drawable.card_thunder_bolt_t4_4, R.drawable.card_thunder_bolt_t4_5, R.drawable.card_thunder_bolt_t4_6,
                                    R.drawable.card_thunder_bolt_t6_1, R.drawable.card_thunder_bolt_t6_2, R.drawable.card_thunder_bolt_t6_3,
                                    R.drawable.card_thunder_bolt_t6_4, R.drawable.card_thunder_bolt_t6_5, R.drawable.card_thunder_bolt_t6_6,
                            },
                            {
                                    R.drawable.card_thunder_bolt_t5_1, R.drawable.card_thunder_bolt_t5_11, R.drawable.card_thunder_bolt_t5_15,
                                    R.drawable.card_thunder_bolt_t5_17, R.drawable.card_thunder_bolt_t5_18, R.drawable.card_thunder_bolt_t5_2,
                                    R.drawable.card_thunder_bolt_t5_20, R.drawable.card_thunder_bolt_t5_21, R.drawable.card_thunder_bolt_t5_3,
                                    R.drawable.card_thunder_bolt_t5_4, R.drawable.card_thunder_bolt_t5_6, R.drawable.card_thunder_bolt_t5_9,
                            },
                            {
                                    R.drawable.card_thunder_bolt_t3_1, R.drawable.card_thunder_bolt_t3_11, R.drawable.card_thunder_bolt_t3_9,
                                    R.drawable.card_thunder_bolt_t6_12, R.drawable.card_thunder_bolt_t7_1, R.drawable.card_thunder_bolt_t7_2,
                                    R.drawable.card_thunder_bolt_t7_3, R.drawable.card_thunder_bolt_t8_1, R.drawable.card_thunder_bolt_t8_2,
                                    R.drawable.card_thunder_bolt_t8_3
                            },
                            {
                                    R.drawable.card_thunder_bolt_t1_10, R.drawable.card_thunder_bolt_t1_11, R.drawable.card_thunder_bolt_t1_12,
                                    R.drawable.card_thunder_bolt_t1_13, R.drawable.card_thunder_bolt_t1_4, R.drawable.card_thunder_bolt_t2_10,
                                    R.drawable.card_thunder_bolt_t2_11, R.drawable.card_thunder_bolt_t2_4, R.drawable.card_thunder_bolt_t3_11,
                                    R.drawable.card_thunder_bolt_t3_9, R.drawable.card_thunder_bolt_t4_1, R.drawable.card_thunder_bolt_t4_2,
                                    R.drawable.card_thunder_bolt_t4_7, R.drawable.card_thunder_bolt_t4_8, R.drawable.card_thunder_bolt_t5_13,
                                    R.drawable.card_thunder_bolt_t5_17, R.drawable.card_thunder_bolt_t5_2, R.drawable.card_thunder_bolt_t5_4,
                                    R.drawable.card_thunder_bolt_t6_1, R.drawable.card_thunder_bolt_t6_7
                            }
                    },
                    //endregion

                    //region module : "Jet"
                    {
                            {
                                    R.drawable.card_jet_1, R.drawable.card_jet_2, R.drawable.card_jet_3,
                                    R.drawable.card_jet_4, R.drawable.card_jet_5, R.drawable.card_jet_6,
                                    R.drawable.card_jet_7, R.drawable.card_jet_8, R.drawable.card_jet_9
                            },
                            {
                                    R.drawable.card_jet_10, R.drawable.card_jet_11, R.drawable.card_jet_12,
                                    R.drawable.card_jet_13, R.drawable.card_jet_14, R.drawable.card_jet_15,
                                    R.drawable.card_jet_16, R.drawable.card_jet_19, R.drawable.card_jet_18,
                                    R.drawable.card_jet_17
                            },
                            {
                                    R.drawable.card_jet_10, R.drawable.card_jet_11, R.drawable.card_jet_12,
                                    R.drawable.card_jet_13, R.drawable.card_jet_16, R.drawable.card_jet_19,
                                    R.drawable.card_jet_20, R.drawable.card_jet_4, R.drawable.card_jet_8
                            },
                            {
                                    R.drawable.card_jet_10, R.drawable.card_jet_12, R.drawable.card_jet_13,
                                    R.drawable.card_jet_14, R.drawable.card_jet_16, R.drawable.card_jet_18,
                                    R.drawable.card_jet_19, R.drawable.card_jet_2, R.drawable.card_jet_22,
                                    R.drawable.card_jet_23, R.drawable.card_jet_24, R.drawable.card_jet_25,
                                    R.drawable.card_jet_26, R.drawable.card_jet_5, R.drawable.card_jet_4,
                                    R.drawable.card_jet_20
                            }
                    },
                    //endregion

                    //region module : "Hit or Miss"
                    {
                            {
                                    R.drawable.card_smiley_10, R.drawable.card_smiley_11, R.drawable.card_smiley_12,
                                    R.drawable.card_smiley_13, R.drawable.card_smiley_14, R.drawable.card_smiley_15,
                                    R.drawable.card_smiley_16, R.drawable.card_smiley_2, R.drawable.card_smiley_3,
                                    R.drawable.card_smiley_5, R.drawable.card_smiley_6, R.drawable.card_smiley_7,
                                    R.drawable.card_smiley_8, R.drawable.card_smiley_9, R.drawable.card_smiley_17,
                                    R.drawable.card_limbo_1
                            },
                            {
                                    R.drawable.card_calling_out_11, R.drawable.card_calling_out_6, R.drawable.card_limbo_1,
                                    R.drawable.card_limbo_11, R.drawable.card_limbo_14, R.drawable.card_limbo_20,
                                    R.drawable.card_limbo_21, R.drawable.card_limbo_22, R.drawable.card_limbo_25,
                                    R.drawable.card_limbo_28, R.drawable.card_limbo_30, R.drawable.card_limbo_33,
                                    R.drawable.card_limbo_34, R.drawable.card_limbo_8, R.drawable.card_smiley_17,
                                    R.drawable.card_limbo_32
                            },
                            {
                                    R.drawable.card_number_1, R.drawable.card_number_2, R.drawable.card_number_9,
                                    R.drawable.card_number_3, R.drawable.card_number_4, R.drawable.card_number_5,
                                    R.drawable.card_number_6, R.drawable.card_number_7, R.drawable.card_number_8,
                                    R.drawable.card_number_0
                            },
                            {
                                    R.drawable.card_calling_out_13, R.drawable.card_calling_out_14, R.drawable.card_limbo_10,
                                    R.drawable.card_limbo_25, R.drawable.card_limbo_26, R.drawable.card_limbo_27,
                                    R.drawable.card_limbo_28, R.drawable.card_limbo_29, R.drawable.card_limbo_37,
                                    R.drawable.card_limbo_7, R.drawable.card_limbo_8, R.drawable.card_limbo_9
                            },
                            {
                                    R.drawable.card_calling_out_1, R.drawable.card_calling_out_5, R.drawable.card_calling_out_8,
                                    R.drawable.card_limbo_1, R.drawable.card_limbo_15, R.drawable.card_limbo_2,
                                    R.drawable.card_limbo_21, R.drawable.card_limbo_22, R.drawable.card_limbo_27,
                                    R.drawable.card_limbo_28, R.drawable.card_limbo_35, R.drawable.card_limbo_5,
                                    R.drawable.card_limbo_6, R.drawable.card_limbo_8, R.drawable.card_number_0,
                                    R.drawable.card_limbo_9
                            },
                            {
                                    R.drawable.card_calling_out_4, R.drawable.card_calling_out_7, R.drawable.card_limbo_16,
                                    R.drawable.card_limbo_21, R.drawable.card_limbo_22, R.drawable.card_limbo_24,
                                    R.drawable.card_limbo_25, R.drawable.card_limbo_27, R.drawable.card_limbo_29,
                                    R.drawable.card_limbo_3, R.drawable.card_limbo_32, R.drawable.card_limbo_4,
                                    R.drawable.card_limbo_7, R.drawable.card_limbo_8, R.drawable.card_limbo_26,
                                    R.drawable.card_limbo_20

                            },
                            {
                                    R.drawable.card_calling_out_9, R.drawable.card_limbo_12, R.drawable.card_limbo_13,
                                    R.drawable.card_limbo_18, R.drawable.card_limbo_19, R.drawable.card_limbo_20,
                                    R.drawable.card_limbo_22, R.drawable.card_limbo_24, R.drawable.card_limbo_25,
                                    R.drawable.card_limbo_26, R.drawable.card_limbo_27, R.drawable.card_limbo_28,
                                    R.drawable.card_limbo_36, R.drawable.card_limbo_7, R.drawable.card_limbo_34,
                                    R.drawable.card_limbo_8
                            },
                            {
                                    R.drawable.card_calling_out_10, R.drawable.card_limbo_14, R.drawable.card_limbo_15,
                                    R.drawable.card_limbo_16, R.drawable.card_limbo_17, R.drawable.card_limbo_20,
                                    R.drawable.card_limbo_22, R.drawable.card_limbo_24, R.drawable.card_limbo_25,
                                    R.drawable.card_limbo_26, R.drawable.card_limbo_27, R.drawable.card_limbo_28,
                                    R.drawable.card_limbo_29, R.drawable.card_limbo_7, R.drawable.card_limbo_34,
                                    R.drawable.card_smiley_9
                            }
                    },
                    //endregion

                    //region module : "Stars 1.0"
                    {
                            {
                                    R.drawable.card_allstar_c_b1_10, R.drawable.card_allstar_c_b2_1, R.drawable.card_allstar_c_by1_10,
                                    R.drawable.card_allstar_c_g2_3, R.drawable.card_allstar_c_g4_2, R.drawable.card_allstar_c_pr_3,
                                    R.drawable.card_allstar_c_pr_7_, R.drawable.card_allstar_c_p_4
                            },
                            {
                                    R.drawable.card_allstar_c_b1_10, R.drawable.card_allstar_c_b1_11, R.drawable.card_allstar_c_b1_12,
                                    R.drawable.card_allstar_c_b1_5, R.drawable.card_allstar_c_b1_6, R.drawable.card_allstar_c_b1_7,
                                    R.drawable.card_allstar_c_b1_8, R.drawable.card_allstar_c_b1_9
                            },
                            {
                                    R.drawable.card_allstar_c_b2_1, R.drawable.card_allstar_c_b2_2, R.drawable.card_allstar_c_b2_3,
                                    R.drawable.card_allstar_c_b2_4, R.drawable.card_allstar_c_b2_5, R.drawable.card_allstar_c_b2_6,
                                    R.drawable.card_allstar_c_b2_7, R.drawable.card_allstar_c_b3_1, R.drawable.card_allstar_c_b3_4,
                                    R.drawable.card_allstar_c_b3_5, R.drawable.card_allstar_c_b3_6, R.drawable.card_allstar_c_pr_3
                            },
                            {
                                    R.drawable.card_allstar_c_by1_1, R.drawable.card_allstar_c_by1_10, R.drawable.card_allstar_c_by1_11,
                                    R.drawable.card_allstar_c_by1_12, R.drawable.card_allstar_c_by1_13, R.drawable.card_allstar_c_by1_14,
                                    R.drawable.card_allstar_c_by1_15, R.drawable.card_allstar_c_by1_2, R.drawable.card_allstar_c_by1_3,
                                    R.drawable.card_allstar_c_by1_4, R.drawable.card_allstar_c_by1_5, R.drawable.card_allstar_c_by1_6,
                                    R.drawable.card_allstar_c_by1_7, R.drawable.card_allstar_c_by1_8, R.drawable.card_allstar_c_by1_9
                            },
                            {
                                    R.drawable.card_allstar_c_by1_16, R.drawable.card_allstar_c_by1_17, R.drawable.card_allstar_c_by1_18,
                                    R.drawable.card_allstar_c_by1_19, R.drawable.card_allstar_c_by1_20, R.drawable.card_allstar_c_by1_21,
                                    R.drawable.card_allstar_c_by1_22, R.drawable.card_allstar_c_by1_23, R.drawable.card_allstar_c_by2_1,
                                    R.drawable.card_allstar_c_by2_2, R.drawable.card_allstar_c_by2_3, R.drawable.card_allstar_c_by2_4,
                                    R.drawable.card_allstar_c_by2_5, R.drawable.card_allstar_c_by2_6, R.drawable.card_allstar_c_by2_7,
                                    R.drawable.card_allstar_c_by2_9, R.drawable.card_allstar_c_by3_1
                            },
                            {
                                    R.drawable.card_allstar_c_g1_1, R.drawable.card_allstar_c_g1_10, R.drawable.card_allstar_c_g1_11,
                                    R.drawable.card_allstar_c_g1_12, R.drawable.card_allstar_c_g1_13, R.drawable.card_allstar_c_g1_2,
                                    R.drawable.card_allstar_c_g1_3, R.drawable.card_allstar_c_g1_4, R.drawable.card_allstar_c_g1_5,
                                    R.drawable.card_allstar_c_g1_6, R.drawable.card_allstar_c_g1_7, R.drawable.card_allstar_c_g1_8,
                                    R.drawable.card_allstar_c_g1_9, R.drawable.card_allstar_c_g2_1, R.drawable.card_allstar_c_g2_2
                            },
                            {
                                    R.drawable.card_allstar_c_g2_1, R.drawable.card_allstar_c_g2_2, R.drawable.card_allstar_c_g2_3,
                                    R.drawable.card_allstar_c_g2_4, R.drawable.card_allstar_c_g2_5, R.drawable.card_allstar_c_g2_6,
                                    R.drawable.card_allstar_c_g2_7, R.drawable.card_allstar_c_g2_8, R.drawable.card_allstar_c_g2_9,
                                    R.drawable.card_allstar_c_g4_1, R.drawable.card_allstar_c_g4_2, R.drawable.card_allstar_c_g4_3
                            },
                            {
                                    R.drawable.card_allstar_c_g1_1, R.drawable.card_allstar_c_g1_2, R.drawable.card_allstar_c_g1_3,
                                    R.drawable.card_allstar_c_g1_4, R.drawable.card_allstar_c_g2_1, R.drawable.card_allstar_c_g2_2,
                                    R.drawable.card_allstar_c_g3_1, R.drawable.card_allstar_c_g3_2, R.drawable.card_allstar_c_g3_3,
                                    R.drawable.card_allstar_c_g3_4, R.drawable.card_allstar_c_g4_1, R.drawable.card_allstar_c_g4_3,
                                    R.drawable.card_allstar_c_g5_1, R.drawable.card_allstar_c_g5_2, R.drawable.card_allstar_c_g6_1_
                            },
                            {
                                    R.drawable.card_allstar_c_pr_1, R.drawable.card_allstar_c_pr_2, R.drawable.card_allstar_c_pr_3,
                                    R.drawable.card_allstar_c_pr_4, R.drawable.card_allstar_c_pr_5, R.drawable.card_allstar_c_pr_6_,
                                    R.drawable.card_allstar_c_pr_7_, R.drawable.card_allstar_c_p_1, R.drawable.card_allstar_c_p_2,
                                    R.drawable.card_allstar_c_p_3, R.drawable.card_allstar_c_p_4, R.drawable.card_allstar_c_p_5,
                                    R.drawable.card_allstar_c_p_6, R.drawable.card_allstar_c_p_7, R.drawable.card_allstar_c_p_8
                            },
                            {
                                    R.drawable.card_allstar_c_b3_1, R.drawable.card_allstar_c_b3_5, R.drawable.card_allstar_c_pr_6_,
                                    R.drawable.card_allstar_c_pr_7_, R.drawable.card_allstar_c_r_1, R.drawable.card_allstar_c_r_2,
                                    R.drawable.card_allstar_c_r_3, R.drawable.card_allstar_c_r_4, R.drawable.card_allstar_c_r_5,
                                    R.drawable.card_allstar_c_r_6, R.drawable.card_allstar_c_r_7, R.drawable.card_allstar_c_r_9
                            },
                            {
                                    R.drawable.card_allstar_c_b1_5, R.drawable.card_allstar_c_b1_6, R.drawable.card_allstar_c_by1_19,
                                    R.drawable.card_allstar_c_by1_20, R.drawable.card_allstar_c_by2_1, R.drawable.card_allstar_c_by2_2,
                                    R.drawable.card_allstar_c_g1_2, R.drawable.card_allstar_c_g1_8, R.drawable.card_allstar_c_g3_4,
                                    R.drawable.card_allstar_c_p_6, R.drawable.card_allstar_c_r_10, R.drawable.card_allstar_c_r_5
                            },
                            {
                                    R.drawable.card_allstar_c_b1_7, R.drawable.card_allstar_c_b3_1, R.drawable.card_allstar_c_by1_12,
                                    R.drawable.card_allstar_c_by1_13, R.drawable.card_allstar_c_by1_14, R.drawable.card_allstar_c_by1_15,
                                    R.drawable.card_allstar_c_by1_17, R.drawable.card_allstar_c_g1_4, R.drawable.card_allstar_c_g1_5,
                                    R.drawable.card_allstar_c_g4_1, R.drawable.card_allstar_c_g4_3, R.drawable.card_allstar_c_p_3
                            },
                            {
                                    R.drawable.card_allstar_c_b1_8, R.drawable.card_allstar_c_b1_9, R.drawable.card_allstar_c_by1_11,
                                    R.drawable.card_allstar_c_by1_12, R.drawable.card_allstar_c_by1_15, R.drawable.card_allstar_c_by1_16,
                                    R.drawable.card_allstar_c_by1_4, R.drawable.card_allstar_c_by1_6, R.drawable.card_allstar_c_by2_3,
                                    R.drawable.card_allstar_c_by2_9, R.drawable.card_allstar_c_g1_1, R.drawable.card_allstar_c_g1_3,
                                    R.drawable.card_allstar_c_g1_6, R.drawable.card_allstar_c_g1_7, R.drawable.card_allstar_c_r_4,
                                    R.drawable.card_allstar_c_r_7
                            },
                            {
                                    R.drawable.card_allstar_c_b1_10, R.drawable.card_allstar_c_b1_11, R.drawable.card_allstar_c_b1_12,
                                    R.drawable.card_allstar_c_by1_19, R.drawable.card_allstar_c_by1_20, R.drawable.card_allstar_c_by1_23,
                                    R.drawable.card_allstar_c_by2_2, R.drawable.card_allstar_c_g1_10, R.drawable.card_allstar_c_g1_11,
                                    R.drawable.card_allstar_c_g1_12, R.drawable.card_allstar_c_g1_13, R.drawable.card_allstar_c_p_1,
                                    R.drawable.card_allstar_c_p_2, R.drawable.card_allstar_c_p_4, R.drawable.card_allstar_c_r_2,
                                    R.drawable.card_allstar_c_r_5
                            },
                            {
                                    R.drawable.card_allstar_c_b2_6, R.drawable.card_allstar_c_b2_7, R.drawable.card_allstar_c_by1_2,
                                    R.drawable.card_allstar_c_by1_21, R.drawable.card_allstar_c_by1_4, R.drawable.card_allstar_c_by1_5,
                                    R.drawable.card_allstar_c_by1_6, R.drawable.card_allstar_c_by2_1, R.drawable.card_allstar_c_by2_3,
                                    R.drawable.card_allstar_c_by2_6, R.drawable.card_allstar_c_by2_9, R.drawable.card_allstar_c_g3_1,
                                    R.drawable.card_allstar_c_g3_2, R.drawable.card_allstar_c_pr_1, R.drawable.card_allstar_c_pr_2,
                                    R.drawable.card_allstar_c_pr_7_
                            }
                    },
                    //endregion

                    //region module : "Shelter"
                    {
                            {
                                    R.drawable.card_house_t4_1, R.drawable.card_house_t4_2, R.drawable.card_house_t4_3,
                                    R.drawable.card_house_t4_4
                            },
                            {
                                    R.drawable.card_house_t4_10, R.drawable.card_house_t4_5, R.drawable.card_house_t4_6,
                                    R.drawable.card_house_t4_7, R.drawable.card_house_t4_8, R.drawable.card_house_t4_9
                            },
                            {
                                    R.drawable.card_house_t4_11, R.drawable.card_house_t4_13, R.drawable.card_house_t4_14,
                                    R.drawable.card_house_t4_15, R.drawable.card_house_t4_16, R.drawable.card_house_t4_17,
                                    R.drawable.card_house_t4_18, R.drawable.card_house_t4_10
                            },
                            {
                                    R.drawable.card_house_t5_1, R.drawable.card_house_t5_2, R.drawable.card_house_t5_3,
                                    R.drawable.card_house_t5_4, R.drawable.card_house_t5_5, R.drawable.card_house_t5_6,
                                    R.drawable.card_house_t5_7, R.drawable.card_house_t6_7
                            },
                            {
                                    R.drawable.card_house_t7_1, R.drawable.card_house_t7_2, R.drawable.card_house_t7_3,
                                    R.drawable.card_house_t7_4, R.drawable.card_house_t7_5, R.drawable.card_house_t7_6,
                                    R.drawable.card_house_t7_7, R.drawable.card_house_t2_5
                            },
                            {
                                    R.drawable.card_house_t7_13, R.drawable.card_house_t7_14, R.drawable.card_house_t7_15,
                                    R.drawable.card_house_t7_16, R.drawable.card_house_t7_17, R.drawable.card_house_t7_18,
                                    R.drawable.card_house_t7_19, R.drawable.card_house_t3_8
                            },
                            {
                                    R.drawable.card_house_t7_10, R.drawable.card_house_t7_11, R.drawable.card_house_t7_12,
                                    R.drawable.card_house_t7_8, R.drawable.card_house_t7_9, R.drawable.card_house_t7_9_0
                            },
                            {
                                    R.drawable.card_house_t1_1, R.drawable.card_house_t1_2, R.drawable.card_house_t1_3,
                                    R.drawable.card_house_t1_4, R.drawable.card_house_t1_5, R.drawable.card_house_t1_6
                            },
                            {
                                    R.drawable.card_house_t2_1, R.drawable.card_house_t2_2, R.drawable.card_house_t2_3,
                                    R.drawable.card_house_t2_4, R.drawable.card_house_t2_5, R.drawable.card_house_t2_6,
                                    R.drawable.card_house_t2_7, R.drawable.card_house_t7_7
                            },
                            {
                                    R.drawable.card_house_t3_1, R.drawable.card_house_t3_2, R.drawable.card_house_t3_3,
                                    R.drawable.card_house_t3_4, R.drawable.card_house_t3_5, R.drawable.card_house_t3_6,
                                    R.drawable.card_house_t3_7, R.drawable.card_house_t3_8
                            },
                            {
                                    R.drawable.card_house_t4_17, R.drawable.card_house_t6_14, R.drawable.card_house_t6_15,
                                    R.drawable.card_house_t6_17, R.drawable.card_house_t6_8, R.drawable.card_house_t6_9,
                                    R.drawable.card_house_t7_12, R.drawable.card_house_t7_18
                            },
                            {
                                    R.drawable.card_house_t4_4, R.drawable.card_house_t5_1, R.drawable.card_house_t5_8,
                                    R.drawable.card_house_t6_10, R.drawable.card_house_t6_18, R.drawable.card_house_t6_7,
                                    R.drawable.card_house_t6_8, R.drawable.card_house_t6_9, R.drawable.card_house_t7_7
                            },
                            {
                                    R.drawable.card_house_t6_14, R.drawable.card_house_t6_14_i, R.drawable.card_house_t6_15,
                                    R.drawable.card_house_t6_15_i, R.drawable.card_house_t6_16, R.drawable.card_house_t6_16_i,
                                    R.drawable.card_house_t6_6, R.drawable.card_house_t6_6_i, R.drawable.card_house_t7_16,
                                    R.drawable.card_house_t7_16_i, R.drawable.card_house_t7_3, R.drawable.card_house_t7_3_i
                            },
                            {
                                    R.drawable.card_house_t5_2, R.drawable.card_house_t5_5, R.drawable.card_house_t6_10,
                                    R.drawable.card_house_t6_11_i, R.drawable.card_house_t6_12, R.drawable.card_house_t6_13_i,
                                    R.drawable.card_house_t6_14_i, R.drawable.card_house_t6_15_i, R.drawable.card_house_t6_16_i,
                                    R.drawable.card_house_t6_17, R.drawable.card_house_t6_18, R.drawable.card_house_t6_2,
                                    R.drawable.card_house_t6_3, R.drawable.card_house_t6_4, R.drawable.card_house_t6_5,
                                    R.drawable.card_house_t6_6, R.drawable.card_house_t6_7, R.drawable.card_house_t6_8,
                                    R.drawable.card_house_t6_9, R.drawable.card_house_t7_4
                            },
                            {
                                    R.drawable.card_house_t5_10, R.drawable.card_house_t5_11, R.drawable.card_house_t5_12,
                                    R.drawable.card_house_t5_2, R.drawable.card_house_t5_3, R.drawable.card_house_t5_4,
                                    R.drawable.card_house_t5_5, R.drawable.card_house_t5_6, R.drawable.card_house_t5_7,
                                    R.drawable.card_house_t5_9, R.drawable.card_house_t6_11, R.drawable.card_house_t6_11_i,
                                    R.drawable.card_house_t6_12, R.drawable.card_house_t6_7, R.drawable.card_house_t6_13,
                                    R.drawable.card_house_t6_13_i,
                            },
                            {
                                    R.drawable.card_house_t1_5, R.drawable.card_house_t1_6, R.drawable.card_house_t2_5,
                                    R.drawable.card_house_t2_6, R.drawable.card_house_t5_11, R.drawable.card_house_t5_12,
                                    R.drawable.card_house_t6_13, R.drawable.card_house_t6_13_i, R.drawable.card_house_t6_6,
                                    R.drawable.card_house_t6_6_i, R.drawable.card_house_t6_8, R.drawable.card_house_t6_9
                            },
                            {
                                    R.drawable.card_house_t4_14, R.drawable.card_house_t4_15, R.drawable.card_house_t5_11,
                                    R.drawable.card_house_t5_12, R.drawable.card_house_t6_10, R.drawable.card_house_t6_14,
                                    R.drawable.card_house_t6_14_i, R.drawable.card_house_t6_15, R.drawable.card_house_t6_15_i,
                                    R.drawable.card_house_t6_16, R.drawable.card_house_t6_16_i, R.drawable.card_house_t6_18,
                                    R.drawable.card_house_t6_6, R.drawable.card_house_t6_6_i, R.drawable.card_house_t7_10,
                                    R.drawable.card_house_t7_11, R.drawable.card_house_t7_16, R.drawable.card_house_t7_16_i,
                                    R.drawable.card_house_t7_17, R.drawable.card_house_t7_18
                            }
                    },
                    //endregion

                    //region module : "Stars 2.0"
                    {
                            {
                                    R.drawable.card_allstar_bw_1, R.drawable.card_allstar_bw_6, R.drawable.card_allstar_bw_80,
                                    R.drawable.card_allstar_bw_5
                            },
                            {
                                    R.drawable.card_allstar_bw_18, R.drawable.card_allstar_bw_19, R.drawable.card_allstar_bw_20,
                                    R.drawable.card_allstar_bw_21
                            },
                            {
                                    R.drawable.card_allstar_bw_1, R.drawable.card_allstar_bw_15, R.drawable.card_allstar_bw_16,
                                    R.drawable.card_allstar_bw_18, R.drawable.card_allstar_bw_19, R.drawable.card_allstar_bw_2,
                                    R.drawable.card_allstar_bw_5, R.drawable.card_allstar_bw_6
                            },
                            {
                                    R.drawable.card_allstar_bw_11, R.drawable.card_allstar_bw_12, R.drawable.card_allstar_bw_13,
                                    R.drawable.card_allstar_bw_14, R.drawable.card_allstar_bw_23, R.drawable.card_allstar_bw_24,
                                    R.drawable.card_allstar_bw_25, R.drawable.card_allstar_bw_26
                            },
                            {
                                    R.drawable.card_allstar_bw_46, R.drawable.card_allstar_bw_47, R.drawable.card_allstar_bw_48,
                                    R.drawable.card_allstar_bw_49, R.drawable.card_allstar_bw_60, R.drawable.card_allstar_bw_61
                            },
                            {
                                    R.drawable.card_allstar_bw_28, R.drawable.card_allstar_bw_29, R.drawable.card_allstar_bw_30,
                                    R.drawable.card_allstar_bw_32, R.drawable.card_allstar_bw_33, R.drawable.card_allstar_bw_41
                            },
                            {
                                    R.drawable.card_allstar_bw_39, R.drawable.card_allstar_bw_40, R.drawable.card_allstar_bw_42,
                                    R.drawable.card_allstar_bw_43, R.drawable.card_allstar_bw_44, R.drawable.card_allstar_bw_45,
                                    R.drawable.card_allstar_bw_8, R.drawable.card_allstar_bw_83
                            },
                            {
                                    R.drawable.card_allstar_bw_16, R.drawable.card_allstar_bw_17, R.drawable.card_allstar_bw_20,
                                    R.drawable.card_allstar_bw_31, R.drawable.card_allstar_bw_34, R.drawable.card_allstar_bw_35,
                                    R.drawable.card_allstar_bw_36, R.drawable.card_allstar_bw_82, R.drawable.card_allstar_bw_70,
                                    R.drawable.card_allstar_bw_57
                            },
                            {
                                    R.drawable.card_allstar_bw_29, R.drawable.card_allstar_bw_31, R.drawable.card_allstar_bw_32,
                                    R.drawable.card_allstar_bw_34, R.drawable.card_allstar_bw_40, R.drawable.card_allstar_bw_41,
                                    R.drawable.card_allstar_bw_42, R.drawable.card_allstar_bw_58, R.drawable.card_allstar_bw_58_1,
                                    R.drawable.card_allstar_bw_59, R.drawable.card_allstar_bw_60, R.drawable.card_allstar_bw_61
                            },
                            {
                                    R.drawable.card_allstar_bw_22, R.drawable.card_allstar_bw_31, R.drawable.card_allstar_bw_34,
                                    R.drawable.card_allstar_bw_53, R.drawable.card_allstar_bw_54, R.drawable.card_allstar_bw_55,
                                    R.drawable.card_allstar_bw_56, R.drawable.card_allstar_bw_62, R.drawable.card_allstar_bw_63,
                                    R.drawable.card_allstar_bw_64, R.drawable.card_allstar_bw_65, R.drawable.card_allstar_bw_75,
                                    R.drawable.card_allstar_bw_76, R.drawable.card_allstar_bw_78, R.drawable.card_allstar_bw_40,
                                    R.drawable.card_allstar_bw_41
                            },
                            {
                                    R.drawable.card_allstar_bw_29, R.drawable.card_allstar_bw_31, R.drawable.card_allstar_bw_33,
                                    R.drawable.card_allstar_bw_34, R.drawable.card_allstar_bw_40, R.drawable.card_allstar_bw_41,
                                    R.drawable.card_allstar_bw_42, R.drawable.card_allstar_bw_43, R.drawable.card_allstar_bw_58,
                                    R.drawable.card_allstar_bw_59, R.drawable.card_allstar_bw_60, R.drawable.card_allstar_bw_61,
                                    R.drawable.card_allstar_bw_63, R.drawable.card_allstar_bw_64, R.drawable.card_allstar_bw_65,
                                    R.drawable.card_allstar_bw_75, R.drawable.card_allstar_bw_76, R.drawable.card_allstar_bw_78,
                                    R.drawable.card_allstar_bw_80, R.drawable.card_allstar_bw_81
                            }
                    }
                    //endregion
            };
    int CardSetValue[][] =
            {
                    //region CardSetValue : "LoveAffair"
                    {
                            CARD_SET_1, CARD_SET_1, CARD_SET_1,
                            CARD_SET_1, CARD_SET_1, CARD_SET_1,
                            CARD_SET_1, CARD_SET_2, CARD_SET_2,
                            CARD_SET_1, CARD_SET_2, CARD_SET_2,
                            CARD_SET_2, CARD_SET_2, CARD_SET_2,
                            CARD_SET_2, CARD_SET_3, CARD_SET_3
                    },
                    //endregion

                    //region CardSetValue : "Thunder-bolt"
                    {

                            CARD_SET_1, CARD_SET_3, CARD_SET_3,
                            CARD_SET_2, CARD_SET_1, CARD_SET_3,
                            CARD_SET_3, CARD_SET_3
                    },
                    //endregion

                    //region CardSetValue : "Jet"
                    {
                            CARD_SET_3, CARD_SET_3, CARD_SET_3,
                            CARD_SET_3
                    },
                    //endregion

                    //region CardSetValue : "Hit or Miss"
                    {
                            CARD_SET_2, CARD_SET_1, CARD_SET_2,
                            CARD_SET_1, CARD_SET_2, CARD_SET_2,
                            CARD_SET_3, CARD_SET_2
                    },
                    //endregion

                    //region CardSetValue : "Stars 1.0"
                    {
                            CARD_SET_1, CARD_SET_2, CARD_SET_2,
                            CARD_SET_2, CARD_SET_2, CARD_SET_3,
                            CARD_SET_3, CARD_SET_3, CARD_SET_3,
                            CARD_SET_2, CARD_SET_3, CARD_SET_3,
                            CARD_SET_3, CARD_SET_3, CARD_SET_3
                    },
                    //endregion

                    //region CardSetValue : "Shelter"
                    {
                            CARD_SET_1, CARD_SET_2, CARD_SET_3,
                            CARD_SET_2, CARD_SET_3, CARD_SET_3,
                            CARD_SET_2, CARD_SET_3, CARD_SET_3,
                            CARD_SET_3, CARD_SET_2, CARD_SET_2,
                            CARD_SET_3, CARD_SET_3, CARD_SET_3,
                            CARD_SET_3, CARD_SET_2, CARD_SET_3,
                            CARD_SET_3, CARD_SET_3
                    },
                    //endregion

                    //region CardSetValue : "Stars 2.0"
                    {
                            CARD_SET_1, CARD_SET_1, CARD_SET_1,
                            CARD_SET_2, CARD_SET_3, CARD_SET_1,
                            CARD_SET_1, CARD_SET_2, CARD_SET_3,
                            CARD_SET_3, CARD_SET_3
                    }
                    //endregion
            };
    int OneBoardSize[][][]=
            {
                    //region OneBoardSize : "LoveAffair"
                    {
                            {4,3}, {4,3},{4,4},
                            {4,4}, {4,4},{4,4},
                            {5,3}, {4,4},{5,3},
                            {4,3}, {6,3},{5,4},
                            {6,3}, {5,3},{5,3},
                            {7,4}, {7,4},{9,4}
                    },
                    //endregion

                    //region OneBoardSize : "Thunder-bolt"
                    {
                            {4,3}, {6,3},{5,4},
                            {5,4}, {6,4},{6,4},
                            {5,4}, {8,5}
                    },
                    //endregion

                    //region OneBoardSize : "Jet"
                    {
                            {6,3}, {5,4}, {6,3},
                            {7,4}
                    },
                    //endregion

                    //region OneBoardSize : "Hit or Miss"
                    {
                            {7,4}, {7,4},{7,3},
                            {6,4},{7,4}, {7,4},
                            {7,4},{7,4}
                    },
                    //endregion

                    //region OneBoardSize : "Stars 1.0"
                    {
                            {4,4},{4,4},{6,4},
                            {6,5},{7,5},{6,5},
                            {6,4},{6,5},{6,5},
                            {6,4},{6,4},{6,4},
                            {8,4},{8,4},{8,4}
                    },
                    //endregion

                    //region OneBoardSize : "Shelter"
                    {
                            {4,2},{4,3},{5,3},
                            {5,3},{5,3},{5,3},
                            {4,3},{4,3},{5,3},
                            {5,3},{5,3},{6,3},
                            {6,4},{8,5},{7,4},
                            {6,4},{8,5}
                    },
                    //endregion

                    //region OneBoardSize : "Stars 2.0"
                    {
                            {4,2},{4,2},{4,4},
                            {4,4},{4,3},{4,3},
                            {5,3},{7,3},{6,4},
                            {7,4},{8,5}
                    }
                    //endregion
            };
    public GameValues(int module_index,int level_index,int stage_index,int challenge_index)
    {
        Module_index=module_index;
        Level_index=level_index;
        Stage_index=stage_index;
        Challenge_index=challenge_index;
    }

    public int[] getCardSet()
    {
        return CardSets[Module_index][Level_index];
    }
    public int getCardSetValue()
    {
        return CardSetValue[Module_index][Level_index];
    }
    public int getPlayerMode() {
        if(Challenge_index<2)
            return HelperClass.ONE_PLAYER;
        else
            return HelperClass.TWO_PLAYER;
    }
    public int getPlayerTwoType() {
        switch (Challenge_index)
        {
            case 2:
                return HelperClass.HURRICANE;
            case 3:
                return HelperClass.ROCK;
            case 4:
                return HelperClass.ANDROBOT;
            default:
                return HelperClass.RANDOM_BOT;
        }
    }
    public int getRobotMemoryLevel() {
            if(Stage_index>=4)
                    return Stage_index+1;
            return Stage_index+4;
    }
    public int getTimeTrialTimer() {
        int maxStages = 6;
        int numberOfLevels=ModuleLevelCount[Module_index];
        int minTimeTrialTime=5400;
        int maxTimeTrialTime=16200;
        float factor = (float)(maxTimeTrialTime-minTimeTrialTime)/(numberOfLevels+maxStages-2);
        return (maxTimeTrialTime - Math.round( factor*(Level_index+Stage_index)));
    }
    public int getBoardType() {
        switch (Stage_index)
        {
            case 0:
            case 2:
            case 4:
                return HelperClass.TWO_BOARD;
            case 1:
            case 3:
            case 5:
                return HelperClass.ONE_BOARD;
        }
        return HelperClass.ONE_BOARD;
    }
    public int getRowSize() {
        int row_size= OneBoardSize[Module_index][Level_index][0];
        int boardType = getBoardType();
        if(boardType==TWO_BOARD)
        {
            if(row_size%2==0 )
            {
                row_size/=2;
            }
            else
            {
                int col_size= OneBoardSize[Module_index][Level_index][1];
                if(row_size==5 && col_size==3)
                    row_size=2;
                else if(row_size==5 && col_size==4)
                    row_size=3;
                else if(row_size==7 && col_size==3)
                    row_size=3;
                else if(row_size==7 && col_size==4)
                    row_size=4;
                else if(row_size==7 && col_size==5)
                    row_size=4;
                else if(row_size==9 && col_size==4)
                    row_size=4;
            }
        }
        return row_size;
    }
    public int getColSize() {
        int col_size= OneBoardSize[Module_index][Level_index][1];

        int boardType = getBoardType();
        if(boardType==TWO_BOARD)
        {
            int row_size= OneBoardSize[Module_index][Level_index][0];
            if (row_size % 2 != 0)
            {
                if(row_size==5 && col_size==3)
                    col_size=4;
                else if(row_size==5 && col_size==4)
                    col_size=3;
                else if(row_size==7 && col_size==5)
                    col_size=4;
            }
        }
        return col_size;
    }
    public int getGameMode() {
        if(Stage_index>3)
        {
            int row_size=OneBoardSize[Module_index][Level_index][0];
            int col_size=OneBoardSize[Module_index][Level_index][1];
            if(row_size==4 && col_size==2)
                return HelperClass.TIME_TRIAL;
            else if(row_size==5 && col_size==3 && getBoardType()==ONE_BOARD)
                return HelperClass.TIME_TRIAL;
        }

        switch (Stage_index)
        {
            case 0:
            case 1:
                return HelperClass.ARCADE;
            case 2:
            case 3:
                return HelperClass.TIME_TRIAL;
            case 4:
//                if (Level_index%2==0)
//                    return HelperClass.TIME_TRIAL;
//                else
                    return HelperClass.ARCADE;
            case 5:
//                if (Level_index%2!=0)
//                    return HelperClass.TIME_TRIAL;
//                else
                    return HelperClass.ARCADE;
        }
        return HelperClass.ARCADE;
    }
    public int getScrollType() {
        if(Stage_index<4)
        {
            return HelperClass.NO_SCROLL;
        }
        int row_size = OneBoardSize[Module_index][Level_index][0];
        int col_size = OneBoardSize[Module_index][Level_index][1];
        int board_type = getBoardType();

        // (4,2)- N, 2B, N
        if(row_size==4 && col_size==2)
            return HelperClass.NO_SCROLL;

        // (5,3)- N, |-> 4,4 in 2B, H
        if(row_size==5 && col_size==3)
        {
            if(board_type==ONE_BOARD)
                return HelperClass.NO_SCROLL;
            else
                return HelperClass.HORIZONTAL;
        }

        //For r>=2c
        // (6,3)- V, | 2B, V
        // (8,4)- V, | 2B, V
        // (9,4)- V,   // -> 8,4 in 2B, V
        // (7,3)- V,   // -> 6,3 in 2B, V
        if(row_size >= 2*col_size)
            return VERTICAL;


        // (7,4)- V,   // -> 8,4 in 2B, V
        if(row_size==7 && col_size==4)
            return VERTICAL;

        // (8,5)- H+V, 2B, H+V
        if(row_size==8 && col_size==5)
            return BOTH;

        // (5,4)- H  |-> 6,3 in 2B, V
        if(row_size==5 && col_size==4)
            if(board_type==ONE_BOARD)
                return HelperClass.HORIZONTAL;
            else
                return HelperClass.VERTICAL;

        // (7,5)- H+V  |-> 8,4 in 2B, V
        if(row_size==7 && col_size==5)
            if(board_type==ONE_BOARD)
                return HelperClass.BOTH;
            else
                return HelperClass.VERTICAL;

        //for rest:
        // (4,3)- H, | 2B, H
        // (4,4)- H, | 2B, H
        // (6,4)- H, | 2B, H
        // (6,5)- H, | 2B, H
        return HelperClass.HORIZONTAL;
    }
    public int getLockingTime()
    {
        int maxStages = 6;
        int maxChallenges = 5;
        int numberOfLevels=ModuleLevelCount[Module_index];
        int minLockingTime=180;
        int maxLockingTime= 603;
        float factor = (float)(maxLockingTime-minLockingTime)/(numberOfLevels+maxStages+maxChallenges-3);
        return (maxLockingTime - Math.round( factor*(Level_index+Stage_index+Challenge_index)));
    }
    public int getBackGroundIndex( )
    {
        int background_index;
        int maxStages = 6;
        int maxChallenges = 5;
        background_index =  (
                                Level_index*maxStages*maxChallenges +
                                Stage_index*maxChallenges +
                                Challenge_index
                            )%12 + 1;

        if(Module_index==0)
        {
            if(Level_index==0 || Level_index==11)
            {
                if(background_index==9)
                    return 4;
            }
        }
        if(Module_index==6)
        {
            if(background_index==12)
            {
                if(Level_index%2==0)
                    return 3;
                return 5;
            }
        }
        if(Module_index==4)
        {
            if(Level_index==1)
            {
                switch (background_index)
                {
                    case 1:
                        return 5;
                    case 2:
                        return 11;
                    case 6:
                        return 12;
                    case 9:
                        return 13;
                }
            }
            if(Level_index==5 || Level_index==7
                    || (Level_index>=10 && Level_index<=13))
            {
                switch (background_index)
                {
                    case 2:
                        if(Stage_index%2==0)
                            return 5;
                        return 10;
                    case 3:
                        return 11;
                    case 4:
                        return 12;
                }
            }
        }

        return background_index;
    }

    public int getBoardSize()
    {
         int row_size = getRowSize();
         int col_size = getColSize();
         int boardSize = row_size*col_size;
         if(getBoardType()==TWO_BOARD)
             boardSize*=2;
        return boardSize;
    }

    public int[] getReplacementCards()
    {
        //region ReplacementCards values
        int ReplacementCards[][]=
                {
                        //region loveAffair
                        {
                                R.drawable.card_heart_t1_3, R.drawable.card_heart_t3_6, R.drawable.card_heart_t4_3,
                                R.drawable.card_heart_t5_6, R.drawable.card_heart_t6_8, R.drawable.card_heart_t8_7,
                                R.drawable.card_heart_t5_1, R.drawable.card_heart_t5_2, R.drawable.card_heart_t5_3,
                                R.drawable.card_heart_t5_4, R.drawable.card_heart_t5_5, R.drawable.card_heart_t2_1,
                                R.drawable.card_heart_t2_2, R.drawable.card_heart_t2_3, R.drawable.card_heart_t2_4,
                                R.drawable.card_heart_t2_5, R.drawable.card_heart_t2_6, R.drawable.card_heart_t2_7,
                                R.drawable.card_heart_t2_8, R.drawable.card_heart_t3_1, R.drawable.card_heart_t3_2,
                                R.drawable.card_heart_t3_3, R.drawable.card_heart_t3_4, R.drawable.card_heart_t3_5,
                                R.drawable.card_heart_t3_7, R.drawable.card_heart_t3_8, R.drawable.card_heart_t4_1,
                                R.drawable.card_heart_t4_2, R.drawable.card_heart_t4_4, R.drawable.card_heart_t4_5,
                                R.drawable.card_heart_t4_6, R.drawable.card_heart_t4_7, R.drawable.card_heart_t4_8,
                                R.drawable.card_heart_t1_1, R.drawable.card_heart_t1_2, R.drawable.card_heart_t1_4,
                                R.drawable.card_heart_t1_5, R.drawable.card_heart_t1_6, R.drawable.card_heart_t1_7,
                                R.drawable.card_heart_t1_8, R.drawable.card_heart_t6_1, R.drawable.card_heart_t6_2,
                                R.drawable.card_heart_t6_3, R.drawable.card_heart_t6_4, R.drawable.card_heart_t6_5,
                                R.drawable.card_heart_t6_6, R.drawable.card_heart_t6_7, R.drawable.card_heart_t8_1,
                                R.drawable.card_heart_t8_2, R.drawable.card_heart_t8_3, R.drawable.card_heart_t8_4,
                                R.drawable.card_heart_t8_5, R.drawable.card_heart_t8_6, R.drawable.card_heart_t8_8,
                                R.drawable.card_heart_t10_1, R.drawable.card_heart_t10_2, R.drawable.card_heart_t10_3,
                                R.drawable.card_heart_t10_4, R.drawable.card_heart_t10_5, R.drawable.card_heart_t7_8,
                                R.drawable.card_heart_t7_3, R.drawable.card_heart_t9_1, R.drawable.card_heart_t9_10,
                                R.drawable.card_heart_t9_11, R.drawable.card_heart_t9_13, R.drawable.card_heart_t9_15,
                                R.drawable.card_heart_t9_16, R.drawable.card_heart_t9_2, R.drawable.card_heart_t9_3,
                                R.drawable.card_heart_t9_4, R.drawable.card_heart_t9_5, R.drawable.card_heart_t9_6,
                                R.drawable.card_heart_t9_7, R.drawable.card_heart_t9_8, R.drawable.card_heart_t9_9,
                                R.drawable.card_heart_t10_6, R.drawable.card_heart_t11,  R.drawable.card_heart_t7_4,
                                R.drawable.card_heart_t7_2, R.drawable.card_heart_t7_5, R.drawable.card_heart_t7_6
                        },
                        //endregion

                        //region thunderbolt
                        {
                                R.drawable.card_thunder_bolt_t1_1, R.drawable.card_thunder_bolt_t3_5, R.drawable.card_thunder_bolt_t3_7,
                                R.drawable.card_thunder_bolt_t4_1, R.drawable.card_thunder_bolt_t5_4, R.drawable.card_thunder_bolt_t6_5,
                                R.drawable.card_thunder_bolt_t1_3, R.drawable.card_thunder_bolt_t1_8, R.drawable.card_thunder_bolt_t2_3,
                                R.drawable.card_thunder_bolt_t3_10, R.drawable.card_thunder_bolt_t4_11, R.drawable.card_thunder_bolt_t4_5,
                                R.drawable.card_thunder_bolt_t5_17, R.drawable.card_thunder_bolt_t8_3, R.drawable.card_thunder_bolt_t2_1,
                                R.drawable.card_thunder_bolt_t3_11, R.drawable.card_thunder_bolt_t3_9, R.drawable.card_thunder_bolt_t6_6,
                                R.drawable.card_thunder_bolt_t8_2, R.drawable.card_thunder_bolt_t8_1, R.drawable.card_thunder_bolt_t3_12,
                                R.drawable.card_thunder_bolt_t3_4, R.drawable.card_thunder_bolt_t3_6, R.drawable.card_thunder_bolt_t3_8,
                                R.drawable.card_thunder_bolt_t3_2, R.drawable.card_thunder_bolt_t4_2, R.drawable.card_thunder_bolt_t4_3,
                                R.drawable.card_thunder_bolt_t4_4, R.drawable.card_thunder_bolt_t4_6, R.drawable.card_thunder_bolt_t6_1,
                                R.drawable.card_thunder_bolt_t6_2, R.drawable.card_thunder_bolt_t6_3, R.drawable.card_thunder_bolt_t6_4,
                                R.drawable.card_thunder_bolt_t5_1, R.drawable.card_thunder_bolt_t5_11, R.drawable.card_thunder_bolt_t5_15,
                                R.drawable.card_thunder_bolt_t5_18, R.drawable.card_thunder_bolt_t5_3, R.drawable.card_thunder_bolt_t5_6,
                                R.drawable.card_thunder_bolt_t5_9, R.drawable.card_thunder_bolt_t3_1, R.drawable.card_thunder_bolt_t7_1,
                                R.drawable.card_thunder_bolt_t7_2, R.drawable.card_thunder_bolt_t7_3, R.drawable.card_thunder_bolt_t1_10,
                                R.drawable.card_thunder_bolt_t1_11, R.drawable.card_thunder_bolt_t1_12, R.drawable.card_thunder_bolt_t1_13,
                                R.drawable.card_thunder_bolt_t1_4, R.drawable.card_thunder_bolt_t2_10, R.drawable.card_thunder_bolt_t2_11,
                                R.drawable.card_thunder_bolt_t2_4, R.drawable.card_thunder_bolt_t4_7, R.drawable.card_thunder_bolt_t4_8,
                                R.drawable.card_thunder_bolt_t5_13, R.drawable.card_thunder_bolt_t5_2, R.drawable.card_thunder_bolt_t6_7
                        },
                        //endregion

                        //region jets
                        {
                                R.drawable.card_jet_1, R.drawable.card_jet_2, R.drawable.card_jet_3,
                                R.drawable.card_jet_4, R.drawable.card_jet_5, R.drawable.card_jet_6,
                                R.drawable.card_jet_7, R.drawable.card_jet_8, R.drawable.card_jet_9 ,
                                R.drawable.card_jet_10, R.drawable.card_jet_11, R.drawable.card_jet_12,
                                R.drawable.card_jet_13, R.drawable.card_jet_14, R.drawable.card_jet_15,
                                R.drawable.card_jet_16, R.drawable.card_jet_17, R.drawable.card_jet_18,
                                R.drawable.card_jet_19, R.drawable.card_jet_20, R.drawable.card_jet_22,
                                R.drawable.card_jet_23, R.drawable.card_jet_24, R.drawable.card_jet_25,
                                R.drawable.card_jet_26
                        },
                        //endregion

                        //region HitOrMiss
                        {
                                R.drawable.card_smiley_10, R.drawable.card_smiley_11, R.drawable.card_smiley_12,
                                R.drawable.card_smiley_13, R.drawable.card_smiley_14, R.drawable.card_smiley_15,
                                R.drawable.card_smiley_16, R.drawable.card_smiley_2, R.drawable.card_smiley_3,
                                R.drawable.card_smiley_5, R.drawable.card_smiley_6, R.drawable.card_smiley_7,
                                R.drawable.card_smiley_8, R.drawable.card_limbo_1, R.drawable.card_calling_out_11,
                                R.drawable.card_calling_out_6, R.drawable.card_limbo_11, R.drawable.card_limbo_20,
                                R.drawable.card_limbo_21, R.drawable.card_limbo_22, R.drawable.card_limbo_25,
                                R.drawable.card_limbo_28, R.drawable.card_limbo_30, R.drawable.card_limbo_33,
                                R.drawable.card_limbo_34, R.drawable.card_limbo_8, R.drawable.card_smiley_17,
                                R.drawable.card_number_1, R.drawable.card_number_2, R.drawable.card_number_9,
                                R.drawable.card_number_3, R.drawable.card_number_4, R.drawable.card_number_5,
                                R.drawable.card_number_6, R.drawable.card_number_7, R.drawable.card_number_8,
                                R.drawable.card_calling_out_13, R.drawable.card_calling_out_14, R.drawable.card_limbo_10,
                                R.drawable.card_limbo_26, R.drawable.card_limbo_27, R.drawable.card_limbo_29,
                                R.drawable.card_limbo_37, R.drawable.card_limbo_7,  R.drawable.card_limbo_9,
                                R.drawable.card_calling_out_1, R.drawable.card_calling_out_5, R.drawable.card_calling_out_8,
                                R.drawable.card_limbo_15, R.drawable.card_limbo_2, R.drawable.card_limbo_35,
                                R.drawable.card_limbo_5, R.drawable.card_limbo_6, R.drawable.card_number_0,
                                R.drawable.card_calling_out_4, R.drawable.card_calling_out_7, R.drawable.card_limbo_24,
                                R.drawable.card_limbo_3, R.drawable.card_limbo_32, R.drawable.card_limbo_4,
                                R.drawable.card_calling_out_9, R.drawable.card_limbo_12, R.drawable.card_limbo_13,
                                R.drawable.card_limbo_18, R.drawable.card_limbo_19, R.drawable.card_limbo_36,
                                R.drawable.card_calling_out_10, R.drawable.card_limbo_14, R.drawable.card_limbo_16,
                                R.drawable.card_limbo_17, R.drawable.card_smiley_9
                        },
                        //endregion

                        //region Stars 1.0
                        {
                                R.drawable.card_allstar_c_b1_10, R.drawable.card_allstar_c_b2_1, R.drawable.card_allstar_c_by1_10,
                                R.drawable.card_allstar_c_g2_3, R.drawable.card_allstar_c_g4_2, R.drawable.card_allstar_c_pr_3,
                                R.drawable.card_allstar_c_pr_7_, R.drawable.card_allstar_c_p_4, R.drawable.card_allstar_c_b1_11,
                                R.drawable.card_allstar_c_b1_12, R.drawable.card_allstar_c_b1_5, R.drawable.card_allstar_c_b1_6,
                                R.drawable.card_allstar_c_b1_7, R.drawable.card_allstar_c_b1_8, R.drawable.card_allstar_c_b1_9,
                                R.drawable.card_allstar_c_b2_2, R.drawable.card_allstar_c_b2_3, R.drawable.card_allstar_c_b2_4,
                                R.drawable.card_allstar_c_b2_5, R.drawable.card_allstar_c_b2_7, R.drawable.card_allstar_c_b3_1,
                                R.drawable.card_allstar_c_b3_4, R.drawable.card_allstar_c_b3_5, R.drawable.card_allstar_c_b3_6,
                                R.drawable.card_allstar_c_by1_1,  R.drawable.card_allstar_c_by1_11, R.drawable.card_allstar_c_by1_12,
                                R.drawable.card_allstar_c_by1_13, R.drawable.card_allstar_c_by1_14, R.drawable.card_allstar_c_by1_15,
                                R.drawable.card_allstar_c_by1_2, R.drawable.card_allstar_c_by1_3, R.drawable.card_allstar_c_by1_4,
                                R.drawable.card_allstar_c_by1_5, R.drawable.card_allstar_c_by1_6, R.drawable.card_allstar_c_by1_7,
                                R.drawable.card_allstar_c_by1_8, R.drawable.card_allstar_c_by1_9, R.drawable.card_allstar_c_g2_2,
                                R.drawable.card_allstar_c_by1_16, R.drawable.card_allstar_c_by1_17, R.drawable.card_allstar_c_by1_18,
                                R.drawable.card_allstar_c_by1_19, R.drawable.card_allstar_c_by1_20, R.drawable.card_allstar_c_by1_21,
                                R.drawable.card_allstar_c_by1_22, R.drawable.card_allstar_c_by1_23, R.drawable.card_allstar_c_by2_1,
                                R.drawable.card_allstar_c_by2_2, R.drawable.card_allstar_c_by2_3, R.drawable.card_allstar_c_by2_4,
                                R.drawable.card_allstar_c_by2_5, R.drawable.card_allstar_c_by2_6, R.drawable.card_allstar_c_by2_7,
                                R.drawable.card_allstar_c_by2_9, R.drawable.card_allstar_c_by3_1, R.drawable.card_allstar_c_g2_1,
                                R.drawable.card_allstar_c_g2_4, R.drawable.card_allstar_c_g2_5, R.drawable.card_allstar_c_g2_6,
                                R.drawable.card_allstar_c_g2_7, R.drawable.card_allstar_c_g2_8, R.drawable.card_allstar_c_g2_9,
                                R.drawable.card_allstar_c_g4_1, R.drawable.card_allstar_c_g4_3, R.drawable.card_allstar_c_g3_1,
                                R.drawable.card_allstar_c_g3_3, R.drawable.card_allstar_c_p_3,  R.drawable.card_allstar_c_p_5,
                                R.drawable.card_allstar_c_g5_1, R.drawable.card_allstar_c_g5_2, R.drawable.card_allstar_c_g6_1_,
                                R.drawable.card_allstar_c_pr_4, R.drawable.card_allstar_c_pr_5, R.drawable.card_allstar_c_pr_6_,
                                R.drawable.card_allstar_c_p_6, R.drawable.card_allstar_c_p_7, R.drawable.card_allstar_c_p_8,
                                R.drawable.card_allstar_c_r_1, R.drawable.card_allstar_c_g1_8, R.drawable.card_allstar_c_g3_4,
                                R.drawable.card_allstar_c_r_3, R.drawable.card_allstar_c_r_4, R.drawable.card_allstar_c_r_5,
                                R.drawable.card_allstar_c_r_6, R.drawable.card_allstar_c_r_7, R.drawable.card_allstar_c_r_9,
                                R.drawable.card_allstar_c_r_10, R.drawable.card_allstar_c_p_2,  R.drawable.card_allstar_c_r_2,
                                R.drawable.card_allstar_c_p_1, R.drawable.card_allstar_c_b2_6, R.drawable.card_allstar_c_g3_2,
                                R.drawable.card_allstar_c_pr_1, R.drawable.card_allstar_c_pr_2
                        },
                        //endregion

                        //region Shelter
                        {
                                R.drawable.card_house_t4_1, R.drawable.card_house_t4_2, R.drawable.card_house_t4_3,
                                R.drawable.card_house_t4_10, R.drawable.card_house_t4_5, R.drawable.card_house_t4_6,
                                R.drawable.card_house_t4_7, R.drawable.card_house_t4_8, R.drawable.card_house_t4_9,
                                R.drawable.card_house_t4_11, R.drawable.card_house_t4_13, R.drawable.card_house_t4_14,
                                R.drawable.card_house_t4_16, R.drawable.card_house_t4_18, R.drawable.card_house_t5_1,
                                R.drawable.card_house_t5_2, R.drawable.card_house_t5_4, R.drawable.card_house_t5_5,
                                R.drawable.card_house_t6_7, R.drawable.card_house_t7_7, R.drawable.card_house_t2_5,
                                R.drawable.card_house_t7_1, R.drawable.card_house_t7_2, R.drawable.card_house_t7_3,
                                R.drawable.card_house_t7_4, R.drawable.card_house_t7_5, R.drawable.card_house_t7_6,
                                R.drawable.card_house_t7_13, R.drawable.card_house_t7_14, R.drawable.card_house_t7_15,
                                R.drawable.card_house_t7_16, R.drawable.card_house_t7_17, R.drawable.card_house_t7_18,
                                R.drawable.card_house_t7_19, R.drawable.card_house_t3_8, R.drawable.card_house_t1_4,
                                R.drawable.card_house_t7_10, R.drawable.card_house_t7_11, R.drawable.card_house_t7_12,
                                R.drawable.card_house_t7_8, R.drawable.card_house_t7_9, R.drawable.card_house_t7_9_0,
                                R.drawable.card_house_t2_1, R.drawable.card_house_t2_2, R.drawable.card_house_t2_3,
                                R.drawable.card_house_t2_4, R.drawable.card_house_t6_6, R.drawable.card_house_t6_6_i,
                                R.drawable.card_house_t2_7, R.drawable.card_house_t7_16_i, R.drawable.card_house_t7_3_i,
                                R.drawable.card_house_t3_1, R.drawable.card_house_t3_2, R.drawable.card_house_t3_3,
                                R.drawable.card_house_t3_4, R.drawable.card_house_t3_5, R.drawable.card_house_t3_6,
                                R.drawable.card_house_t3_7, R.drawable.card_house_t6_10, R.drawable.card_house_t6_18,
                                R.drawable.card_house_t4_17, R.drawable.card_house_t6_14, R.drawable.card_house_t6_15,
                                R.drawable.card_house_t6_17, R.drawable.card_house_t6_8, R.drawable.card_house_t6_9,
                                R.drawable.card_house_t6_14_i, R.drawable.card_house_t6_15_i, R.drawable.card_house_t6_16,
                                R.drawable.card_house_t6_11_i, R.drawable.card_house_t6_12, R.drawable.card_house_t6_13_i,
                                R.drawable.card_house_t6_16_i, R.drawable.card_house_t4_4, R.drawable.card_house_t5_8,
                                R.drawable.card_house_t6_2, R.drawable.card_house_t5_6, R.drawable.card_house_t5_7,
                                R.drawable.card_house_t6_3, R.drawable.card_house_t6_4, R.drawable.card_house_t6_5,
                                R.drawable.card_house_t5_3, R.drawable.card_house_t5_9, R.drawable.card_house_t6_11,
                                R.drawable.card_house_t6_13, R.drawable.card_house_t1_5, R.drawable.card_house_t1_6,
                                R.drawable.card_house_t2_6, R.drawable.card_house_t5_11, R.drawable.card_house_t4_15,
                                R.drawable.card_house_t5_10,  R.drawable.card_house_t5_12
                        },
                        //endregion

                        //region Stars 2.0
                        {
                                R.drawable.card_allstar_bw_1, R.drawable.card_allstar_bw_6, R.drawable.card_allstar_bw_80,
                                R.drawable.card_allstar_bw_5, R.drawable.card_allstar_bw_15, R.drawable.card_allstar_bw_16,
                                R.drawable.card_allstar_bw_18, R.drawable.card_allstar_bw_19, R.drawable.card_allstar_bw_20,
                                R.drawable.card_allstar_bw_21, R.drawable.card_allstar_bw_2, R.drawable.card_allstar_bw_17,
                                R.drawable.card_allstar_bw_11, R.drawable.card_allstar_bw_12, R.drawable.card_allstar_bw_13,
                                R.drawable.card_allstar_bw_14, R.drawable.card_allstar_bw_23, R.drawable.card_allstar_bw_24,
                                R.drawable.card_allstar_bw_25, R.drawable.card_allstar_bw_26, R.drawable.card_allstar_bw_57,
                                R.drawable.card_allstar_bw_46, R.drawable.card_allstar_bw_47, R.drawable.card_allstar_bw_48,
                                R.drawable.card_allstar_bw_49, R.drawable.card_allstar_bw_60, R.drawable.card_allstar_bw_61,
                                R.drawable.card_allstar_bw_28, R.drawable.card_allstar_bw_29, R.drawable.card_allstar_bw_30,
                                R.drawable.card_allstar_bw_32, R.drawable.card_allstar_bw_33, R.drawable.card_allstar_bw_41,
                                R.drawable.card_allstar_bw_39, R.drawable.card_allstar_bw_40, R.drawable.card_allstar_bw_42,
                                R.drawable.card_allstar_bw_43, R.drawable.card_allstar_bw_44, R.drawable.card_allstar_bw_45,
                                R.drawable.card_allstar_bw_8, R.drawable.card_allstar_bw_83, R.drawable.card_allstar_bw_59,
                                R.drawable.card_allstar_bw_31, R.drawable.card_allstar_bw_34, R.drawable.card_allstar_bw_35,
                                R.drawable.card_allstar_bw_36, R.drawable.card_allstar_bw_82, R.drawable.card_allstar_bw_70,
                                R.drawable.card_allstar_bw_58, R.drawable.card_allstar_bw_58_1, R.drawable.card_allstar_bw_22,
                                R.drawable.card_allstar_bw_53, R.drawable.card_allstar_bw_54, R.drawable.card_allstar_bw_55,
                                R.drawable.card_allstar_bw_56, R.drawable.card_allstar_bw_62, R.drawable.card_allstar_bw_63,
                                R.drawable.card_allstar_bw_64, R.drawable.card_allstar_bw_65, R.drawable.card_allstar_bw_75,
                                R.drawable.card_allstar_bw_76, R.drawable.card_allstar_bw_78, R.drawable.card_allstar_bw_81
                        }
                        //endregion
                };
        //endregion

        int []replacementArray = ReplacementCards[Module_index];
        int end=replacementArray.length-1;
        //region delete cards in current level
        for(int resInLevel: CardSets[Module_index][Level_index])
        {
            int loc=-1;
            for(int i=0;i<=end;i++)
            {
                if(replacementArray[i]==resInLevel)
                {
                    loc=i;
                    break;
                }
            }
            if(loc>=0)
            {
                while (loc<end)
                {
                    replacementArray[loc]=replacementArray[loc+1];
                    loc++;
                }
                replacementArray[end--]= resInLevel;
            }
        }
        //endregion

        shuffleArray(replacementArray,end+1);
        int size = getBoardSize();
        int []newReplacementArray = new int[size];
        int lim = Math.min(size,replacementArray.length);
        for(int i=0;i<lim;i++)
        {
            newReplacementArray[i]=replacementArray[i];
        }
        for (int i = lim;i<size;i++)
        {
            newReplacementArray[i]=newReplacementArray[i-lim];
        }

        return newReplacementArray;
    }
    private void shuffleArray(int[] ar,int length)
    {
        // If running on Java 6 or older, use `new Random()` on RHS
        Random rnd;
        if(Build.VERSION.SDK_INT >= 21 )
            rnd = ThreadLocalRandom.current();
        else
            rnd = new Random();

        for (int i = length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    //region board info
    // (4,2)- N, 2B, N
    // (4,3)- H, 2B | H
    // (4,4)- H, | 2B, H
    // (5,3)- N,   // -> 4,4 in 2B, H
    // (5,4)- H    // -> 6,3 in 2B, V
    // (6,3)- V, | 2B, V
    // (6,4)- H, | 2B, H
    // (6,5)- H, | 2B, H
    // (9,4)- V,   // -> 8,4 in 2B, V
    // (7,3)- V,   // -> 6,3 in 2B, V
    // (7,4)- V,   // -> 8,4 in 2B, V
    // (7,5)- H+V  // -> 8,4 in 2B, V
    // (8,4)- V, | 2B, V
    // (8,5)- H+V, 2B, H+V
    //
    //endregion

}
