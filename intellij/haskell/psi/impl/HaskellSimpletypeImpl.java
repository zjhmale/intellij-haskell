// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static intellij.haskell.psi.HaskellTypes.*;
import intellij.haskell.psi.*;
import scala.collection.Seq;

public class HaskellSimpletypeImpl extends HaskellCompositeElementImpl implements HaskellSimpletype {

  public HaskellSimpletypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitSimpletype(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellGconSym getGconSym() {
    return findChildByClass(HaskellGconSym.class);
  }

  @Override
  @Nullable
  public HaskellParallelArrayType getParallelArrayType() {
    return findChildByClass(HaskellParallelArrayType.class);
  }

  @Override
  @Nullable
  public HaskellQcon getQcon() {
    return findChildByClass(HaskellQcon.class);
  }

  @Override
  @Nullable
  public HaskellQconOp getQconOp() {
    return findChildByClass(HaskellQconOp.class);
  }

  @Override
  @Nullable
  public HaskellQvarOp getQvarOp() {
    return findChildByClass(HaskellQvarOp.class);
  }

  @Override
  @Nullable
  public HaskellTtype getTtype() {
    return findChildByClass(HaskellTtype.class);
  }

  @Override
  @NotNull
  public List<HaskellTypeSignature> getTypeSignatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTypeSignature.class);
  }

  @Override
  @NotNull
  public List<HaskellVarId> getVarIdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellVarId.class);
  }

  public Seq<HaskellNamedElement> getIdentifierElements() {
    return HaskellPsiImplUtil.getIdentifierElements(this);
  }

}
