(
{
	a = Pan2.ar(SinOsc.ar(220, 0, 0.2), SinOsc.kr(0.5));
	b = Pan2.ar(SinOsc.ar(330, 0, 0.2), SinOsc.kr(-0.6));
	a + b;
}.play;
)