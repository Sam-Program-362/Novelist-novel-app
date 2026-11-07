.class public Lorg/apache/tika/sax/CleanPhoneText;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final cleanPhoneRegex:Ljava/lang/String; = "([2-9]\\d{2}[2-9]\\d{6})"

.field public static final cleanSubstitutions:[[[Ljava/lang/String;

.field static final phoneRegex:Ljava/lang/String; = "([{(<]{0,3}[2-9][\\W_]{0,3}\\d[\\W_]{0,3}\\d[\\W_]{0,6}[2-9][\\W_]{0,3}\\d[\\W_]{0,3}\\d[\\W_]{0,6}\\d[\\W_]{0,3}\\d[\\W_]{0,3}\\d[\\W_]{0,3}\\d)"


# direct methods
.method static constructor <clinit>()V
    .locals 120

    .line 1
    const-string v0, "&#\\d{1,3};"

    const-string v1, ""

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [[Ljava/lang/String;

    move-result-object v1

    const-string v0, "th0usand"

    const-string v2, "thousand"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v3

    const-string v0, "th1rteen"

    const-string v4, "thirteen"

    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v0

    const-string v5, "f0urteen"

    const-string v6, "fourteen"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    const-string v7, "e1ghteen"

    const-string v8, "eighteen"

    filled-new-array {v7, v8}, [Ljava/lang/String;

    move-result-object v7

    const-string v9, "n1neteen"

    const-string v10, "nineteen"

    filled-new-array {v9, v10}, [Ljava/lang/String;

    move-result-object v9

    const-string v11, "f1fteen"

    const-string v12, "fifteen"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    const-string v13, "s1xteen"

    const-string v14, "sixteen"

    filled-new-array {v13, v14}, [Ljava/lang/String;

    move-result-object v13

    const-string v15, "th1rty"

    move-object/from16 v16, v0

    const-string v0, "thirty"

    filled-new-array {v15, v0}, [Ljava/lang/String;

    move-result-object v15

    move-object/from16 v26, v1

    const-string v1, "e1ghty"

    move-object/from16 v27, v0

    const-string v0, "eighty"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v17, v1

    const-string v1, "n1nety"

    move-object/from16 v28, v0

    const-string v0, "ninety"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v18, v1

    const-string v1, "fourty"

    move-object/from16 v29, v0

    const-string v0, "forty"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v19, v1

    const-string v1, "f0urty"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v20, v1

    const-string v1, "e1ght"

    move-object/from16 v30, v2

    const-string v2, "eight"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v21, v1

    const-string v1, "f0rty"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v22, v1

    const-string v1, "f1fty"

    move-object/from16 v31, v0

    const-string v0, "fifty"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v23, v1

    const-string v1, "s1xty"

    move-object/from16 v32, v0

    const-string v0, "sixty"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v24, v1

    const-string v1, "zer0"

    move-object/from16 v33, v0

    const-string v0, "zero"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v25, v1

    const-string v1, "f0ur"

    move-object/from16 v34, v0

    const-string v0, "four"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v35, v1

    const-string v1, "f1ve"

    move-object/from16 v36, v0

    const-string v0, "five"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v37, v1

    const-string v1, "n1ne"

    move-object/from16 v38, v0

    const-string v0, "nine"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v39, v1

    const-string v1, "0ne"

    move-object/from16 v40, v0

    const-string v0, "one"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v41, v1

    const-string v1, "tw0"

    move-object/from16 v42, v0

    const-string v0, "two"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v43, v1

    const-string v1, "s1x"

    move-object/from16 v44, v3

    const-string v3, "six"

    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v1

    move-object/from16 v45, v10

    move-object/from16 v46, v12

    move-object/from16 v47, v14

    move-object v10, v15

    move-object/from16 v12, v18

    move-object/from16 v14, v20

    move-object/from16 v15, v21

    move-object/from16 v18, v24

    move-object/from16 v20, v35

    move-object/from16 v21, v37

    move-object/from16 v24, v43

    move-object/from16 v3, v44

    move-object/from16 v35, v0

    move-object/from16 v37, v2

    move-object v0, v6

    move-object v6, v7

    move-object v2, v8

    move-object v7, v9

    move-object v8, v11

    move-object v9, v13

    move-object/from16 v11, v17

    move-object/from16 v13, v19

    move-object/from16 v17, v23

    move-object/from16 v19, v25

    move-object/from16 v23, v41

    move-object/from16 v25, v1

    move-object v1, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v22

    move-object/from16 v22, v39

    filled-new-array/range {v3 .. v25}, [[Ljava/lang/String;

    move-result-object v3

    const-string v4, "twenty[\\W_]{0,3}1"

    const-string v5, "twenty-one"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v48

    const-string v4, "twenty[\\W_]{0,3}2"

    const-string v5, "twenty-two"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v49

    const-string v4, "twenty[\\W_]{0,3}3"

    const-string v5, "twenty-three"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v50

    const-string v4, "twenty[\\W_]{0,3}4"

    const-string v5, "twenty-four"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v51

    const-string v4, "twenty[\\W_]{0,3}5"

    const-string v5, "twenty-five"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v52

    const-string v4, "twenty[\\W_]{0,3}6"

    const-string v5, "twenty-six"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v53

    const-string v4, "twenty[\\W_]{0,3}7"

    const-string v5, "twenty-seven"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v54

    const-string v4, "twenty[\\W_]{0,3}8"

    const-string v5, "twenty-eight"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v55

    const-string v4, "twenty[\\W_]{0,3}9"

    const-string v5, "twenty-nine"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v56

    const-string v4, "thirty[\\W_]{0,3}1"

    const-string v5, "thirty-one"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v57

    const-string v4, "thirty[\\W_]{0,3}2"

    const-string v5, "thirty-two"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v58

    const-string v4, "thirty[\\W_]{0,3}3"

    const-string v5, "thirty-three"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v59

    const-string v4, "thirty[\\W_]{0,3}4"

    const-string v5, "thirty-four"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v60

    const-string v4, "thirty[\\W_]{0,3}5"

    const-string v5, "thirty-five"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v61

    const-string v4, "thirty[\\W_]{0,3}6"

    const-string v5, "thirty-six"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v62

    const-string v4, "thirty[\\W_]{0,3}7"

    const-string v5, "thirty-seven"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v63

    const-string v4, "thirty[\\W_]{0,3}8"

    const-string v5, "thirty-eight"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v64

    const-string v4, "thirty[\\W_]{0,3}9"

    const-string v5, "thirty-nine"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v65

    const-string v4, "forty[\\W_]{0,3}1"

    const-string v5, "forty-one"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v66

    const-string v4, "forty[\\W_]{0,3}2"

    const-string v5, "forty-two"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v67

    const-string v4, "forty[\\W_]{0,3}3"

    const-string v5, "forty-three"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v68

    const-string v4, "forty[\\W_]{0,3}4"

    const-string v5, "forty-four"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v69

    const-string v4, "forty[\\W_]{0,3}5"

    const-string v5, "forty-five"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v70

    const-string v4, "forty[\\W_]{0,3}6"

    const-string v5, "forty-six"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v71

    const-string v4, "forty[\\W_]{0,3}7"

    const-string v5, "forty-seven"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v72

    const-string v4, "forty[\\W_]{0,3}8"

    const-string v5, "forty-eight"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v73

    const-string v4, "forty[\\W_]{0,3}9"

    const-string v5, "forty-nine"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v74

    const-string v4, "fifty[\\W_]{0,3}1"

    const-string v5, "fifty-one"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v75

    const-string v4, "fifty[\\W_]{0,3}2"

    const-string v5, "fifty-two"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v76

    const-string v4, "fifty[\\W_]{0,3}3"

    const-string v5, "fifty-three"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v77

    const-string v4, "fifty[\\W_]{0,3}4"

    const-string v5, "fifty-four"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v78

    const-string v4, "fifty[\\W_]{0,3}5"

    const-string v5, "fifty-five"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v79

    const-string v4, "fifty[\\W_]{0,3}6"

    const-string v5, "fifty-six"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v80

    const-string v4, "fifty[\\W_]{0,3}7"

    const-string v5, "fifty-seven"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v81

    const-string v4, "fifty[\\W_]{0,3}8"

    const-string v5, "fifty-eight"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v82

    const-string v4, "fifty[\\W_]{0,3}9"

    const-string v5, "fifty-nine"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v83

    const-string v4, "sixty[\\W_]{0,3}1"

    const-string v5, "sixty-one"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v84

    const-string v4, "sixty[\\W_]{0,3}2"

    const-string v5, "sixty-two"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v85

    const-string v4, "sixty[\\W_]{0,3}3"

    const-string v5, "sixty-three"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v86

    const-string v4, "sixty[\\W_]{0,3}4"

    const-string v5, "sixty-four"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v87

    const-string v4, "sixty[\\W_]{0,3}5"

    const-string v5, "sixty-five"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v88

    const-string v4, "sixty[\\W_]{0,3}6"

    const-string v5, "sixty-six"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v89

    const-string v4, "sixty[\\W_]{0,3}7"

    const-string v5, "sixty-seven"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v90

    const-string v4, "sixty[\\W_]{0,3}8"

    const-string v5, "sixty-eight"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v91

    const-string v4, "sixty[\\W_]{0,3}9"

    const-string v5, "sixty-nine"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v92

    const-string v4, "seventy[\\W_]{0,3}1"

    const-string v5, "seventy-one"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v93

    const-string v4, "seventy[\\W_]{0,3}2"

    const-string v5, "seventy-two"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v94

    const-string v4, "seventy[\\W_]{0,3}3"

    const-string v5, "seventy-three"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v95

    const-string v4, "seventy[\\W_]{0,3}4"

    const-string v5, "seventy-four"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v96

    const-string v4, "seventy[\\W_]{0,3}5"

    const-string v5, "seventy-five"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v97

    const-string v4, "seventy[\\W_]{0,3}6"

    const-string v5, "seventy-six"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v98

    const-string v4, "seventy[\\W_]{0,3}7"

    const-string v5, "seventy-seven"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v99

    const-string v4, "seventy[\\W_]{0,3}8"

    const-string v5, "seventy-eight"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v100

    const-string v4, "seventy[\\W_]{0,3}9"

    const-string v5, "seventy-nine"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v101

    const-string v4, "eighty[\\W_]{0,3}1"

    const-string v5, "eighty-one"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v102

    const-string v4, "eighty[\\W_]{0,3}2"

    const-string v5, "eighty-two"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v103

    const-string v4, "eighty[\\W_]{0,3}3"

    const-string v5, "eighty-three"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v104

    const-string v4, "eighty[\\W_]{0,3}4"

    const-string v5, "eighty-four"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v105

    const-string v4, "eighty[\\W_]{0,3}5"

    const-string v5, "eighty-five"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v106

    const-string v4, "eighty[\\W_]{0,3}6"

    const-string v5, "eighty-six"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v107

    const-string v4, "eighty[\\W_]{0,3}7"

    const-string v5, "eighty-seven"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v108

    const-string v4, "eighty[\\W_]{0,3}8"

    const-string v5, "eighty-eight"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v109

    const-string v4, "eighty[\\W_]{0,3}9"

    const-string v5, "eighty-nine"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v110

    const-string v4, "ninety[\\W_]{0,3}1"

    const-string v5, "ninety-one"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v111

    const-string v4, "ninety[\\W_]{0,3}2"

    const-string v5, "ninety-two"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v112

    const-string v4, "ninety[\\W_]{0,3}3"

    const-string v5, "ninety-three"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v113

    const-string v4, "ninety[\\W_]{0,3}4"

    const-string v5, "ninety-four"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v114

    const-string v4, "ninety[\\W_]{0,3}5"

    const-string v5, "ninety-five"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v115

    const-string v4, "ninety[\\W_]{0,3}6"

    const-string v5, "ninety-six"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v116

    const-string v4, "ninety[\\W_]{0,3}7"

    const-string v5, "ninety-seven"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v117

    const-string v4, "ninety[\\W_]{0,3}8"

    const-string v5, "ninety-eight"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v118

    const-string v4, "ninety[\\W_]{0,3}9"

    const-string v5, "ninety-nine"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v119

    filled-new-array/range {v48 .. v119}, [[Ljava/lang/String;

    move-result-object v4

    const-string v5, "twenty-one"

    const-string v6, "21"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v48

    const-string v5, "twenty-two"

    const-string v6, "22"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v49

    const-string v5, "twenty-three"

    const-string v6, "23"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v50

    const-string v5, "twenty-four"

    const-string v6, "24"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v51

    const-string v5, "twenty-five"

    const-string v6, "25"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v52

    const-string v5, "twenty-six"

    const-string v6, "26"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v53

    const-string v5, "twenty-seven"

    const-string v6, "27"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v54

    const-string v5, "twenty-eight"

    const-string v6, "28"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v55

    const-string v5, "twenty-nine"

    const-string v6, "29"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v56

    const-string v5, "thirty-one"

    const-string v6, "31"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v57

    const-string v5, "thirty-two"

    const-string v6, "32"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v58

    const-string v5, "thirty-three"

    const-string v6, "33"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v59

    const-string v5, "thirty-four"

    const-string v6, "34"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v60

    const-string v5, "thirty-five"

    const-string v6, "35"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v61

    const-string v5, "thirty-six"

    const-string v6, "36"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v62

    const-string v5, "thirty-seven"

    const-string v6, "37"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v63

    const-string v5, "thirty-eight"

    const-string v6, "38"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v64

    const-string v5, "thirty-nine"

    const-string v6, "39"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v65

    const-string v5, "forty-one"

    const-string v6, "41"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v66

    const-string v5, "forty-two"

    const-string v6, "42"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v67

    const-string v5, "forty-three"

    const-string v6, "43"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v68

    const-string v5, "forty-four"

    const-string v6, "44"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v69

    const-string v5, "forty-five"

    const-string v6, "45"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v70

    const-string v5, "forty-six"

    const-string v6, "46"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v71

    const-string v5, "forty-seven"

    const-string v6, "47"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v72

    const-string v5, "forty-eight"

    const-string v6, "48"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v73

    const-string v5, "forty-nine"

    const-string v6, "49"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v74

    const-string v5, "fifty-one"

    const-string v6, "51"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v75

    const-string v5, "fifty-two"

    const-string v6, "52"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v76

    const-string v5, "fifty-three"

    const-string v6, "53"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v77

    const-string v5, "fifty-four"

    const-string v6, "54"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v78

    const-string v5, "fifty-five"

    const-string v6, "55"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v79

    const-string v5, "fifty-six"

    const-string v6, "56"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v80

    const-string v5, "fifty-seven"

    const-string v6, "57"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v81

    const-string v5, "fifty-eight"

    const-string v6, "58"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v82

    const-string v5, "fifty-nine"

    const-string v6, "59"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v83

    const-string v5, "sixty-one"

    const-string v6, "61"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v84

    const-string v5, "sixty-two"

    const-string v6, "62"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v85

    const-string v5, "sixty-three"

    const-string v6, "63"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v86

    const-string v5, "sixty-four"

    const-string v6, "64"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v87

    const-string v5, "sixty-five"

    const-string v6, "65"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v88

    const-string v5, "sixty-six"

    const-string v6, "66"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v89

    const-string v5, "sixty-seven"

    const-string v6, "67"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v90

    const-string v5, "sixty-eight"

    const-string v6, "68"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v91

    const-string v5, "sixty-nine"

    const-string v6, "69"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v92

    const-string v5, "seventy-one"

    const-string v6, "71"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v93

    const-string v5, "seventy-two"

    const-string v6, "72"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v94

    const-string v5, "seventy-three"

    const-string v6, "73"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v95

    const-string v5, "seventy-four"

    const-string v6, "74"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v96

    const-string v5, "seventy-five"

    const-string v6, "75"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v97

    const-string v5, "seventy-six"

    const-string v6, "76"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v98

    const-string v5, "seventy-seven"

    const-string v6, "77"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v99

    const-string v5, "seventy-eight"

    const-string v6, "78"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v100

    const-string v5, "seventy-nine"

    const-string v6, "79"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v101

    const-string v5, "eighty-one"

    const-string v6, "81"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v102

    const-string v5, "eighty-two"

    const-string v6, "82"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v103

    const-string v5, "eighty-three"

    const-string v6, "83"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v104

    const-string v5, "eighty-four"

    const-string v6, "84"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v105

    const-string v5, "eighty-five"

    const-string v6, "85"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v106

    const-string v5, "eighty-six"

    const-string v6, "86"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v107

    const-string v5, "eighty-seven"

    const-string v6, "87"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v108

    const-string v5, "eighty-eight"

    const-string v6, "88"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v109

    const-string v5, "eighty-nine"

    const-string v6, "89"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v110

    const-string v5, "ninety-one"

    const-string v6, "91"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v111

    const-string v5, "ninety-two"

    const-string v6, "92"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v112

    const-string v5, "ninety-three"

    const-string v6, "93"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v113

    const-string v5, "ninety-four"

    const-string v6, "94"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v114

    const-string v5, "ninety-five"

    const-string v6, "95"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v115

    const-string v5, "ninety-six"

    const-string v6, "96"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v116

    const-string v5, "ninety-seven"

    const-string v6, "97"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v117

    const-string v5, "ninety-eight"

    const-string v6, "98"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v118

    const-string v5, "ninety-nine"

    const-string v6, "99"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v119

    filled-new-array/range {v48 .. v119}, [[Ljava/lang/String;

    move-result-object v5

    const-string v6, "hundred"

    const-string v7, "00"

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, "000"

    move-object/from16 v8, v30

    filled-new-array {v8, v7}, [Ljava/lang/String;

    move-result-object v7

    filled-new-array {v6, v7}, [[Ljava/lang/String;

    move-result-object v6

    const-string v7, "seventeen"

    const-string v8, "17"

    filled-new-array {v7, v8}, [Ljava/lang/String;

    move-result-object v48

    const-string v7, "13"

    filled-new-array {v1, v7}, [Ljava/lang/String;

    move-result-object v49

    const-string v1, "14"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v50

    const-string v0, "18"

    filled-new-array {v2, v0}, [Ljava/lang/String;

    move-result-object v51

    const-string v0, "19"

    move-object/from16 v1, v45

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v52

    const-string v0, "15"

    move-object/from16 v1, v46

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v53

    const-string v0, "16"

    move-object/from16 v1, v47

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v54

    const-string v0, "seventy"

    const-string v1, "70"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v55

    const-string v0, "eleven"

    const-string v1, "11"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v56

    const-string v0, "twelve"

    const-string v1, "12"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v57

    const-string v0, "twenty"

    const-string v1, "20"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v58

    const-string v0, "30"

    move-object/from16 v1, v27

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v59

    const-string v0, "80"

    move-object/from16 v1, v28

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v60

    const-string v0, "90"

    move-object/from16 v1, v29

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v61

    const-string v0, "three"

    const-string v1, "3"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v62

    const-string v0, "seven"

    const-string v1, "7"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v63

    const-string v0, "8"

    move-object/from16 v1, v37

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v64

    const-string v0, "40"

    move-object/from16 v1, v31

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v65

    const-string v0, "50"

    move-object/from16 v1, v32

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v66

    const-string v0, "60"

    move-object/from16 v1, v33

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v67

    const-string v0, "0"

    move-object/from16 v1, v34

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v68

    const-string v1, "4"

    move-object/from16 v2, v36

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v69

    const-string v1, "5"

    move-object/from16 v2, v38

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v70

    const-string v1, "9"

    move-object/from16 v2, v40

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v71

    const-string v1, "1"

    move-object/from16 v2, v42

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v72

    const-string v2, "2"

    move-object/from16 v7, v35

    filled-new-array {v7, v2}, [Ljava/lang/String;

    move-result-object v73

    const-string v2, "six"

    const-string v7, "6"

    filled-new-array {v2, v7}, [Ljava/lang/String;

    move-result-object v74

    const-string v2, "ten"

    const-string v7, "10"

    filled-new-array {v2, v7}, [Ljava/lang/String;

    move-result-object v75

    filled-new-array/range {v48 .. v75}, [[Ljava/lang/String;

    move-result-object v2

    const-string v7, "oh"

    filled-new-array {v7, v0}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, "o"

    filled-new-array {v8, v0}, [Ljava/lang/String;

    move-result-object v0

    const-string v8, "i"

    filled-new-array {v8, v1}, [Ljava/lang/String;

    move-result-object v8

    const-string v9, "l"

    filled-new-array {v9, v1}, [Ljava/lang/String;

    move-result-object v1

    filled-new-array {v7, v0, v8, v1}, [[Ljava/lang/String;

    move-result-object v7

    move-object v1, v6

    move-object v6, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v1

    move-object/from16 v1, v26

    filled-new-array/range {v1 .. v7}, [[[Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/tika/sax/CleanPhoneText;->cleanSubstitutions:[[[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static clean(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lorg/apache/tika/sax/CleanPhoneText;->cleanSubstitutions:[[[Ljava/lang/String;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_1

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    array-length v5, v4

    .line 17
    move v6, v2

    .line 18
    :goto_1
    if-ge v6, v5, :cond_0

    .line 19
    .line 20
    aget-object v7, v4, v6

    .line 21
    .line 22
    aget-object v8, v7, v2

    .line 23
    .line 24
    const/4 v9, 0x1

    .line 25
    aget-object v7, v7, v9

    .line 26
    .line 27
    invoke-virtual {p0, v8, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    add-int/lit8 v6, v6, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v0, "[\\D+\\s]"

    .line 38
    .line 39
    const-string v1, ""

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static extractPhoneNumbers(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lorg/apache/tika/sax/CleanPhoneText;->clean(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "([2-9]\\d{2}[2-9]\\d{6})"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->find(I)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-lez v5, :cond_0

    .line 41
    .line 42
    add-int/lit8 v6, v5, -0x1

    .line 43
    .line 44
    invoke-virtual {p0, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const-string v5, ""

    .line 50
    .line 51
    :goto_1
    const-string v6, "82"

    .line 52
    .line 53
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    const-string v6, "*"

    .line 60
    .line 61
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move v2, v3

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    return-object v1
.end method
