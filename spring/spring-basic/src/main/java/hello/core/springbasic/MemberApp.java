package hello.core.springbasic;

import hello.core.springbasic.member.Grade;
import hello.core.springbasic.member.Member;
import hello.core.springbasic.member.MemberService;
import hello.core.springbasic.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}