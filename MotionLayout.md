https://developer.android.com/reference/android/support/constraint/motion/MotionLayout
# MotionLayout 
可以通过`LayoutDescription`链接`MotionScene`和`ConstraintLayout`，使得`MotionLayout`在几个`MotionScene`状态间切换
|Tags|Description|
|:--|:--|
|<StateSet>||
|<ConstraintSet>||
|<Transition>||

## Transition
|Attributes|Description|
|:--|:--|
|android:id||
|constraintSetStart||
|constraintSetEnd||
|motionInterpolator||
|duration||
|staggered||
|autoTransition||
|<OnSwipe>||
|<OnClick>||
|<KeyFrameSet>||

### OnSwipe(可选)
|Attributes|Description|
|:--|:--|
|touchAnchorId||
|touchRegionId||
|touchAnchorSide||
|maxVelocity||
|dragDirection||
|maxAcceleration||
|dragScale||
|moveWhenScrollAtTop||
|autoComplete||

### OnClick(可选)
|Attributes|Description|
|:--|:--|
|motionTarget||
|clickAction||

## StateSet
|Attributes|Description|
|:--|:--|
|<State>||

### State
|Attributes|Description|
|:--|:--|
|android:id||
|constraints||
|Variant||

#### Variant
|Attributes|Description|
|:--|:--|
|region_widthLessThan||
|region_widthMoreThan||
|region_heightLessThan||
|region_heightMoreThan||
|constraints||

## ConstraintSet
|Attributes|Description|
|:--|:--|
|android:id||
|<Constraint>||

### Constraint
|Attributes|Description|
|:--|:--|
|android:id||
|[ConstraintLayout attributes]||
|[Standard View attributes]||
|transitionEasing||
|pathMotionArc||
|transitionPathRotate||
|drawPath||
|progress||
|<CustomAttribute>||
|<Layout>||
|<PropertySet>||
|<Transform>||
|<Motion>||

#### Layout

#### PropertySet
|Attributes|Description|
|:--|:--|
|visibility||
|alpha||
|motionProgress||
|layout_constraintTag||

#### Transform
|Attributes|Description|
|:--|:--|
|android:elevation||
|android:rotation||
|android:rotationX||
|android:rotationY||
|android:scaleX||
|android:scaleY||
|android:translationX||
|android:translationY||
|android:translationZ||

#### Motion
|Attributes|Description|
|:--|:--|
|transitionEasing||
|pathMotionArc||
|motionPathRotate||
|drawPath||

##### CustomAttribute
|Attributes|Description|
|:--|:--|
|attributeName||
|customColorValue||
|customIntegerValue||
|customFloatValue||
|customStringValue||
|customDimension||
|customBoolean||

### KeyFrameSet
|Attributes|Description|
|:--|:--|
|<KeyPosition>||
|<KeyAttribute>||
|<KeyCycle>||
|<KeyTimeCycle>||
|<KeyTrigger>||

#### KeyPosition
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|transitionEasing||
|pathMotionArc||
|keyPositionType||
|percentX||
|percentY||
|percentWidth||
|percentHeight||
|curveFit||
|drawPath||
|sizePercent||
|curveFit||

### KeyAttribute
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|curveFit||
|transitionEasing||
|transitionPathRotate||
|drawPath||
|motionProgress||
|[standard view attributes]||
|<CustomAttribute>||

#### CustomAttribute
|Attributes|Description|
|:--|:--|
|attributeName||
|customColorValue||
|customIntegerValue||
|customFloatValue||
|customStringValue||
|customDimension||
|customBoolean||

### KeyCycle
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|[Standard View attributes]||
|waveShape||
|wavePeriod||
|waveOffset||
|transitionPathRotate||
|progress||
|<CustomAttribute>||

#### CustomAttribute
|Attributes|Description|
|:--|:--|
|attributeName||
|customFloatValue||

### KeyTimeCycle
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|[Standard View attributes]||
|waveShape||
|wavePeriod||
|waveOffset||
|transitionPathRotate||
|progress||
|<CustomAttribute>||

#### CustomAttribute
|Attributes|Description|
|:--|:--|
|attributeName||
|customFloatValue||

### KeyTrigger
|Attributes|Description|
|:--|:--|
|motionTarget||
|framePosition||
|onCross||
|onPositiveCross||
|onNegativeCross||
|triggerSlack||
|triggerId||
|motion_postLayoutCollision||
|motion_triggerOnCollision||

## Standard attributes
|Attributes|Description|
|:--|:--|
|android:visibility||
|android:alpha||
|android:elevation||
|android:rotation||
|android:rotationX||
|android:rotationY||
|android:scaleX||
|android:scaleY||
|android:translationX||
|android:translationY||
|android:translationZ||
